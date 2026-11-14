import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.sound.sampled.LineUnavailableException;

public class Game {
    private final Player player;
    private static Clip clip;

    public Game(Player player) {
        this.player = player;
    }

    public void start() {
        //Playing audio

        String filePath="./music/slayr_-_Holding_Instrumental.wav";
        File file=new File(filePath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            clip=AudioSystem.getClip();
            clip.open(audioStream);

            //play with loop
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            //Reducing the volumn
            FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

            volume.setValue(-15.0f);

        }catch(LineUnavailableException e){
            System.out.println("Cannot access audio file;");
        }
        catch(FileNotFoundException e){
            System.out.println("File cannot find.");
        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio type is wrong!");
        }
        catch(IOException e){
            System.out.println("Something went wrong with audio");
        }


        // * Clear the console and display the player's information
        Util.clearConsole();
        // * Show the intro Scene
        IntroScene intro = new IntroScene();
        CalculusScene calculus = new CalculusScene();
        LunchScene lunch = new LunchScene();
        EndingScene ending = new EndingScene();
        Final finalScene = new Final();
        while (player.isAlive()) {

            intro.play(player);
            if(!player.isAlive()) break;
            calculus.play(player);
            if(!player.isAlive()) break;
            lunch.play(player);
            if(!player.isAlive()) break;
            if(player.getStudyAfterLunch()){
                StudyScene study = new StudyScene();
                study.play(player);
            } else {
                HangOutScene hangOut = new HangOutScene();
                hangOut.play(player);
            }
            if(!player.isAlive()) break;
            ending.play(player);
            break;
        }

    finalScene.play(player);
    
    //closing the audio if the Game end
    clip.close();


    }
}
