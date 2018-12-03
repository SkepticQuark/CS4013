/**
TestCourse is a test class for Course.java
@author Murdo Mackenzie 16152522
*/
public class TestCourse{
	public static void main(String[] args) {
		//Create course
		Course CS4013 = new Course("CS4013");

		//Add three students
		CS4013.addStudent("James");
		CS4013.addStudent("Frank");
		CS4013.addStudent("Murphy");

		//Remove a student
		CS4013.dropStudent("Frank");

		//Displays students in the course
		System.out.println("\nThe students in the course " + 
			CS4013.getCourseName() + ":");
		String[] students = CS4013.getStudents();
		for (int i = 0; i < CS4013.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}
}