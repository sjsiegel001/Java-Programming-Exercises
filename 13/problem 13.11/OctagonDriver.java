package pro1311;

public class OctagonDriver {
	public static void main(String [] args) {
		Octagon oct1 = new Octagon(5);
		
		System.out.println(oct1.getArea());
		System.out.println(oct1.getPerimeter());
		
		Octagon oct2 = oct1.clone();
		
		if(oct1.compareTo(oct2) == 0) {
			System.out.println("oct1 is equal in size to oct2");
		} else if(oct1.compareTo(oct2) > 0) {
			System.out.println("oct1 is bigger than oct2");
		} else {
			System.out.println("oct1 is smaller than oct2");
		}
	}
}
