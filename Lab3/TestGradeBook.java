/**
 * TestGradeBook tests the other classes by creating two GradeBook objects and adding results and printing results
 * @author Murdo Mackenzie 16152522
 */
 
public class TestGradeBook {
    public static void main(String [] args)
    {
	//create objects
	GradeBook book1 = new GradeBook("Physics",2);
	GradeBook book2 = new GradeBook("Applied Maths",3);
	
	//add students and results
	book1.addStudentResult("18168128",1,80);
	book1.addStudentResult("17165921",2,78);
		
	book2.addStudentResult("12548430",1,98);
	book2.addStudentResult("15215879",2,42);
	book2.addStudentResult("12468763",3,38);
	
	//print results
	System.out.println(book1.toString());
	System.out.print(book2.toString());
    }
}
