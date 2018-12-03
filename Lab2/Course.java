/**
Course class allows for the creation of courses in which students are created.
@author Murdo Mackenzie 16152522
*/
public class Course {
	//Data fields
	private String courseName;
	private String[] students = new String[4];
	private int numberOfStudents;

	/**Constructor which creates a course and takes a string for it's name.
		@param courseName string which specifies course name*/
	public Course(String courseName) {
		this.courseName = courseName;
	}

	/**Method which takes a string of student and adds it to an array of students.
		@param student name of the student.*/
	public void addStudent(String student) {
		//Automatically increases the array size when out of space. 
		if (numberOfStudents == students.length) {
			String[] a = new String[students.length + 1];
			for (int i = 0; i < numberOfStudents; i++) {
				a[i] = students[i];
			}
			students = a;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	/**Method which returns students.
		@return students*/
	public String[] getStudents() {
		return students;
	}

	/**Method which returns the number of students.
		@return numberOfStudents*/
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	/**Method which returns course name.
		@return courseName*/
	public String getCourseName() {
		return courseName;
	}

	/**Method which removes a student from a course.
		@return student*/
	public void dropStudent(String student) {
		int index = findStudent(student);
		if (index >= 0) {
			dropStudent(index);
		}
		else {
			System.out.println(student + " is not in the course: " + courseName);
		}
	}
	
	/**Method which deletes the student from the array of students once they have been removed from a course.*/
	private void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		for (int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index) {
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numberOfStudents--;
	}

	/**Method which clears all students.*/
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}

	/**Method to find a student in an array and return their index. Returns -1 if student is not found.*/
	private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
}