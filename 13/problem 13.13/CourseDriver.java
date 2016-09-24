package prob1313;

import java.util.Arrays;

public class CourseDriver {
	public static void main(String [] args) {
		Course course1 = new Course("BPA 202");
		
		course1.addStudent("Dilbert Pickles");
		course1.addStudent("Howie Doohan");
		course1.addStudent("Marsha Mellow");
		course1.addStudent("Rod N. Reel");
		course1.addStudent("Tom Morrow");
		
		Course course2 = course1.clone();
		String [] clonedStudents = course2.getStudents();
		System.out.println(Arrays.toString(clonedStudents));
		
	}
}
