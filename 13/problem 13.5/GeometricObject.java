package prob135;

//GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObject implements Comparable<GeometricObject> {
private String color = "white";
private boolean filled;

	public static void main(String [] args) {
		GeometricObject cir1 = new Circle(5);
		GeometricObject cir2 = new Circle(3);
		
		System.out.println(max(cir1, cir2));
		
		GeometricObject rect1 = new Rectangle(8, 12);
		GeometricObject rect2 = new Rectangle(3, 5);
		
		System.out.println(max(rect1, rect2));
		
		
	}


/**Default construct*/
protected GeometricObject() {
}

/**Construct a geometric object*/
protected GeometricObject(String color, boolean filled) {
 this.color = color;
 this.filled = filled;
}

/**Getter method for color*/
public String getColor() {
 return color;
}

/**Setter method for color*/
public void setColor(String color) {
 this.color = color;
}

/**Getter method for filled. Since filled is boolean,
  so, the get method name is isFilled*/
public boolean isFilled() {
 return filled;
}

/**Setter method for filled*/
public void setFilled(boolean filled) {
 this.filled = filled;
}

/**Abstract method findArea*/
public abstract double getArea();

/**Abstract method getPerimeter*/
public abstract double getPerimeter();




/** --- My Additions --- **/
@Override
public int compareTo(GeometricObject o) {
	if(this.getArea() > o.getArea()) {
		return 1;
	} else {
		return 0;
	}
}
public static String max(GeometricObject foo, GeometricObject bar) {
	if(foo.compareTo(bar) == 1) {
		return "the object with area " + foo.getArea() + " is bigger than the object with area " + bar.getArea();
	} else {
		return "the object with area " + foo.getArea() + " is smaller than the object with area " + bar.getArea();
	}
}

}

