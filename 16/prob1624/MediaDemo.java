package prob1624;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class MediaDemo extends BorderPane {
    
	String totalTime = "";
	
	public MediaDemo() {
		
	    final String MEDIA_URL = "http://cs.armstrong.edu/liang/common/sample.mp4";
	    
		Media media = new Media(MEDIA_URL);
		Slider slVolume = new Slider();
		Slider slTime = new Slider();
		Button playButton = new Button("Play");
		Button rewindButton = new Button("Replay");
		HBox mediaControls = new HBox(10);
		
		
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        
        playButton.setOnAction(e -> { soundControlUI(playButton, mediaPlayer, slTime);  });
        rewindButton.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));
        
        slVolume.setPrefWidth(100);
        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
        slVolume.setMinWidth(40);
        slVolume.setValue(50);
        mediaPlayer.volumeProperty().bind( slVolume.valueProperty().divide(100) );


        slTime.setPrefWidth(120);
        
        mediaControls.setAlignment(Pos.CENTER);
        mediaControls.setPadding(new Insets(5));
        mediaControls.setSpacing(20);

        Label lblTimecode = new Label("0", slTime);
        mediaControls.getChildren().addAll(playButton, rewindButton, new Label("Time"), lblTimecode, new Label("Volume"), slVolume);

        mediaPlayer.currentTimeProperty().addListener(e -> { adjustTimecode(slTime, mediaPlayer, lblTimecode);  });
        slTime.valueProperty().addListener(ov -> {
            if (slTime.isValueChanging()) {
                mediaPlayer.seek(new Duration(slTime.getValue()));
            }
        });
        
        this.setCenter(mediaView);
        this.setBottom(mediaControls);
	}
	
	public void soundControlUI(Button playButton, MediaPlayer mediaPlayer, Slider slTime) {
		if (playButton.getText() == "Play" || playButton.getText() == "Paused") {
            mediaPlayer.play();
            totalTime = Double.toString(mediaPlayer.getStopTime().toMillis());
            slTime.setMax(mediaPlayer.getStopTime().toMillis());
            playButton.setText("Pause");
        } else {
            mediaPlayer.pause();
            playButton.setText("Play");
        }
	}
	
	public void adjustTimecode(Slider slTime, MediaPlayer mediaPlayer, Label lblTimecode) {
        if (!slTime.isValueChanging()) {
            slTime.setValue(mediaPlayer.getCurrentTime().toMillis());
        }

	    lblTimecode.setText((int)mediaPlayer.getCurrentTime().toMillis() + "/" + totalTime);
    }
}
