/**
 * StudentResult class stores a student ID and a testResult object
 * @author Murdo Mackenzie 16152522
 */
 
public class StudentResult {
	//data fields
	public String studentID;
    private TestResult studentResult = new TestResult();
	
	/* constructor taking student ID */
    StudentResult(String studentID)
    {
	this.studentID = studentID;
    }
	
	/* constructor with arguments studentID and numOfTests */
    StudentResult(String studentID, int numOfTests)
    {
        this.studentID = studentID;
	studentResult = new TestResult(numOfTests);
    }
	
	/* method addResult to add a test result for a particular student */
    public void addResult(int testID, double value)
    {
	studentResult.setScore(testID,value);
    }
	
	/* toString method */
    public String toString()
    {
	return studentResult.toString(studentID);
    }
	    
}
