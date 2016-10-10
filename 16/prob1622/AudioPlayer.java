package prob1622;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;

public class AudioPlayer extends HBox {
	
	public String location = "file:/C:/Users/steve/workspace/chap16/assets/DieWachtAmRhein.mp3";
	
	public AudioPlayer() {
        AudioClip myClip = new AudioClip(location);

        Button btnPlay = new Button("Play");
        Button btnLoop = new Button("Loop");
        Button btnStop = new Button("Stop");
        
        btnPlay.setOnAction(e-> {
            if (myClip.isPlaying()) {
            	myClip.stop();
            }
            myClip.play();
        });        
        btnLoop.setOnAction(e-> {
            if (myClip.isPlaying()) {
            	myClip.stop();
            }
            myClip.setCycleCount(AudioClip.INDEFINITE);
            myClip.play();
        });
        
        btnStop.setOnAction(e -> myClip.stop());
        this.getChildren().addAll(btnPlay, btnLoop, btnStop);
        this.setSpacing(5);
        this.setPadding(new Insets(5));

	}
}
