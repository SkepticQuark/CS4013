import java.util.*;

/**
 *	Class file for the creation of a gradebook
 * 	@author Murdo Mackenzie 16152522
 */

public class GradeBook {
	//create data fields
    private String name;
    private int numOfTests;
    private ArrayList<StudentResult> studentResults = new ArrayList<StudentResult>();
	
	/* constructor method */
    GradeBook(String newName, double newTests)
    {
	name = newName;
	numOfTests = (int) newTests;
    }
	
	/* method to add student result by taking ID, testID and result value */
    public void addStudentResult(String id, int testID, double value)
    {
	boolean inArray = false;
	int position = 0;
	for (int i = 0; i < studentResults.size(); i++)
	{
            if (studentResults.get(i).studentID == id)
            {
		inArray = true;
                position = i;
            }
	}
	StudentResult newStudent = new StudentResult(id,numOfTests);
	studentResults.add(newStudent);
	if(inArray)
	{
            studentResults.get(position).addResult(testID,value);
	}
    }
	
	/* toString method */
    public String toString()
    {
	String result = "";
		
	for (int i = 0; i < studentResults.size(); i++)
	{
            result += studentResults.get(i).toString() + "\n";
	}
		
	return result;
    }
}
