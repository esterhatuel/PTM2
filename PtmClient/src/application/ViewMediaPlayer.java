package application;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ViewMediaPlayer {
	private File file = new File("./src/resources/ecli.mp3");
	private MediaPlayer mp;
	private static ViewMediaPlayer mediaPlayer;
	private ViewMediaPlayer(){
	  	mp =new MediaPlayer(new Media(this.file.toURI().toString()));
	    mp.setCycleCount(MediaPlayer.INDEFINITE);
	  	mp.play();
	}

	public static ViewMediaPlayer getInstance(){
	    if (mediaPlayer == null){
	    	mediaPlayer = new ViewMediaPlayer();
	    }

	    return mediaPlayer;
	}

	public void setSong(File file) {;
		mp.stop();
		mp = new MediaPlayer(new Media(file.toURI().toString()));
	    mp.setCycleCount(MediaPlayer.INDEFINITE);
		mp.play();
	}




}
