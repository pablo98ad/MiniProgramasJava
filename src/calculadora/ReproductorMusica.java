package calculadora;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class ReproductorMusica {
	String path = "Ficheros/mus2.mp3";
	Media media;
	MediaPlayer mediaPlayer;
	
	public ReproductorMusica() {
		 this.media = new Media(new File(this.path).toURI().toString());
         this.mediaPlayer = new MediaPlayer(media);
		
		
	}
	
	public void reproducirInicio() {
        try {
        	//Duration d = new Duration(100000.00);
        	//this.mediaPlayer.setStartTime(d);
      //  this.mediaPlayer.setAutoPlay(true);
        this.mediaPlayer.play();
        
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
	
	public double getProgreso() {
		Duration d = this.mediaPlayer.getCurrentTime();
		
		return d.toSeconds();
				
		
	}
	
	public void ajustarVolumen(int v) {
		double vv=(double)v/100;
		//System.out.println(vv);
		this.mediaPlayer.setVolume(vv);
		
		
	}
	
	public void pausa() {
		this.mediaPlayer.pause();
		
	}
	
	public void reanudar() {
		this.mediaPlayer.play();
		
	}
}
