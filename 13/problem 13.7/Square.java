package prob137;

public class Square extends GeometricObject implements Colorable {
	
	private double area;
	private double perimeter;
	
	public Square(double area, double perimeter) {
		super();
		this.area = area;
		this.perimeter = perimeter;
	}

	/** Return area */
	public double getArea() {
		return this.area;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return this.perimeter;
	}
	
}
