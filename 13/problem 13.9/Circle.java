package prob139;

//Circle.java: The circle class that extends GeometricObject and implements Comparable
class Circle extends GeometricObject implements Comparable<Circle> {
	private double radius;

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Implement the getArea method defined in GeometricObject */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Implement the getPerimeter method defined in GeometricObject*/
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "[Circle] radius = " + radius;
	}

	@Override
	public int compareTo(Circle obj) {
		if (this.getArea() > obj.getArea())
		  return 1;
		else if (this.getArea() < obj.getArea())
		  return -1;
		else
		  return 0;
	}

	public boolean equals(Object obj) {
		return this.radius == ((Circle)obj).radius;
	}
}
