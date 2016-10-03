package prob153;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MyBall extends Pane {

	private ImageView myBall;
	private int extremityX;
	private int extremityY;

    public MyBall(int width, int height) {        	
    	myBall = new ImageView(new Image("ball-12.png"));
    	int ballDiameter = 160;       	
    	getChildren().add(myBall);
    	this.extremityX = width - ballDiameter - 30;
    	this.extremityY = height - ballDiameter - 30;
    }

    public void moveUp() {
        if (!(myBall.getY() - 10 < 0))
        	myBall.setY(myBall.getY() - 30);
        
    }
    public void moveDown() {
        if (!(myBall.getY() > getExtremityY()));
        	myBall.setY(myBall.getY() + 30);
    }
    public void moveRight() {
        if (!(myBall.getX() > getExtremityX()))
        	myBall.setX(myBall.getX() + 30);
    }
    public void moveLeft() {
        if (!(myBall.getX() - 10 < 0))
        	myBall.setX(myBall.getX() - 30);

    }

	public int getExtremityX() {
		return extremityX;
	}

	public int getExtremityY() {
		return extremityY;
	}
}