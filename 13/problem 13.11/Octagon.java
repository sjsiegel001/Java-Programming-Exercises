package pro1311;

import prob135.GeometricObject;

public class Octagon extends GeometricObject implements Cloneable {
	private double area;
	private double side;
	
	public Octagon(double side) {
		this.side = side;
		this.area = (2 + 4 / Math.sqrt(2)) * side * side;
	}

	public double getArea() {
		return area;
	}
	public double getPerimeter() {
		return side*8;
	}
	
	public double getSide() {
		return this.side;
	}
	
	public Octagon clone() {
        try {
            return (Octagon) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
	}	
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public int compareTo(Octagon o) {
		if(getSide() > o.getSide()) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
