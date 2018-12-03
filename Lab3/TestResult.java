/**
 * Class with the purpose of storing results of tests
 * @author Murdo Mackenzie 16152522
 */
 
public class TestResult {
	//create data fields
    private int numOfTests;
    private double [] results = new double[numOfTests];
    private static int [] a2 = {0,1,30,35,48,52,56,60,64,72,80};
    private static String [] a1 = {"NG","F","D2","D1","C3","C2","C1","B3","B2","B1","A2","A1"};
    
	/* constructor with no-args that assumes there will be three test scores */
    TestResult(){
        numOfTests = 3;
        results = new double[numOfTests];
    }
    
	/* constructor with argument for number of tests */
    TestResult(int newTests){
        numOfTests = newTests;
        results = new double[numOfTests];
    }
    
	/* method for setting score of the ith test*/
    void setScore(int i, double value){
        results[i-1] = value;
    }
    
	/* method to return result of the ith test */
    double getScore(int i){
        return results[i-1];
    }
    
	/* method to return the average result */
    double getAverage(){
        double avg = 0;
        for(int i =0;i<results.length;i++)
        {
            avg =+ results[i];
            avg = avg/results.length;
        }
        return avg;
    }
    
	/* method to return total of test scores */
    double getTotal(){
        double total = 0;
        for(int i =0;i<results.length;i++)
        {
            total =+ results[i];
        }
        return total;
    }
    
	/* method to return grade */
    String getGrade(){
        double score = 0;
		//int n = n.getAverage();
		score = this.getAverage();
		String grade = "";
		for (int i=0;i<a2.length;i++)
		{
            if(score>=80)
                grade = a1[11];
            else if(score>=72 && score<80)
                grade = a1[10];
            else if(score>=64 && score<72)
				grade = a1[9];
            else if(score>=60 && score<64)
                grade = a1[8];
            else if(score>=56 && score<60)
                grade = a1[7];
            else if(score>=52 && score<56)
                grade = a1[6];
            else if(score>=48 && score<52)
                grade = a1[5];
            else if(score>=40 && score<48)
                grade = a1[4];
            else if(score>=35 && score<40)
                grade = a1[3];
            else if(score>=30 && score<35)
                grade = a1[2];
            else if(score>=1 && score<40)
                grade = a1[1];
            else
                grade = a1[0];
		}
		
		return grade;       
    }
    
	/*  toString that returns the student ID, each of the test scores and the grade as a comma separated string */
    public String toString(String studentID)
    {
	String result = "";
	result += studentID + ",";
		
	for (int i = 1; i <= results.length; i++)
            {
		result += this.getScore(i) + ","; 
            }
	result += this.getGrade();
		
	return result;
    }
}
