package prob137;

import java.util.Random;

public class SquareDriver {
	public static void main(String [] args) {
		
		GeometricObject[] mysquares = new GeometricObject[5];
		Random randomGenerator = new Random();
		
		for ( int i=0; i<mysquares.length; i++ ) {
			//create a square with random area and perimeter
			int randArea = randomGenerator.nextInt(10);
			int randPerim = randomGenerator.nextInt(10);
			mysquares[i] = new Square(randArea, randPerim);
			
			//display its area and how it's colored
			System.out.println(mysquares[i].getArea());
			mysquares[i].howToColor();
		}
		
	}
}
