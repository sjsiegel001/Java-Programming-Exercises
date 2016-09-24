package prob1313;

public class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9
	}
	
	//my addition: clones course with students deep copied
	public Course clone() {
        try {
        	//perform a shallow copy
            Course courseClone = (Course)super.clone();
            courseClone.students = (String[])(students.clone());
            return courseClone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
	}	
}