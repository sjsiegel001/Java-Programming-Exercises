package prob139;

public class Exercise139 {
	public static void main(String[] args) {
		Circle obj1 = new Circle();
		Circle obj2 = new Circle();
		// set the radius of 1 circle and then
		// set the radius of a 2nd circle
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.compareTo(obj2));
	}
}
