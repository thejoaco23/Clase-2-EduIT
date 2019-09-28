package ar.com.eduit.curso.java.advanced.clase01;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
public class ReproductorR implements Runnable {
    public static void main(String[] args) {
        try {
            //ponemos donde esta el archivo mp3 
            new Player(new FileInputStream(new File("mp3/condor.mp3"))).play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override public void run(){
        try {
            new Player(new FileInputStream(new File("mp3/condor.mp3"))).play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
      
    }
}