/**
 * Exercise 6.13 returns a random number between 1 and 54 excluding numbers passed
 * in the argument.
 *
 * @author Murdo Mackenzie 16152522 
 * @version 28-09-18
 */

public class Exercise6_13 {
/** Method getRandom returns a random number between 1 and 54,
	*   excluding the numbers passed in the argument.*/
	public static int getRandom(int... numbers) {
		int num; //Random number
		boolean isExcluded; //Is the number excluded
		do { 
			isExcluded = false;
			num = 1 + (int)(Math.random() * 5);
			for (int e: numbers) {
				if (num == e)
					isExcluded = true;
			}
		} while (isExcluded); //Test if number is Excluded
		return num;
	}   
}
