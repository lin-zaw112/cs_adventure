import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class MusicPlayer {
    private Clip clip;

    public void play(String filePath) {
        stop(); // Close any previously playing music.

        try (AudioInputStream stream =
                     AudioSystem.getAudioInputStream(new File(filePath))) {
            clip = AudioSystem.getClip();
            clip.open(stream);

            setVolume(-15.0f);
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio format.");
            stop();
        } catch (IOException e) {
            System.out.println("Cannot read audio file: " + filePath);
            stop();
        } catch (LineUnavailableException e) {
            System.out.println("Audio output is unavailable.");
            stop();
        }
    }

    public void setVolume(float decibels) {
        if (clip != null && clip.isOpen()
                && clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {

            FloatControl volume = (FloatControl)
                    clip.getControl(FloatControl.Type.MASTER_GAIN);

            // Keep the volume within the supported range.
            float value = Math.max(
                    volume.getMinimum(),
                    Math.min(volume.getMaximum(), decibels)
            );

            volume.setValue(value);
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
            clip.close();
            clip = null;
        }
    }
}
