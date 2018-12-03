/**
MyPoint class allows for the creation of points through x,y coordinates and calculating the distance between them.
@author: Murdo Mackenzie 16152522
*/
public class MyPoint {
	// Data fields for coordinates
	private double x;
	private double y;

	/**No-arg constructor that creates point 0,0*/
	MyPoint() {
		this(0, 0);
	}

	/**Constructs a point with specified coordinates*/
	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**Return x*/
	public double getX() {
		return x;
	}

	/**Return y*/
	public double getY() {
		return y;
	}

	/**Returns the distance from this point to a specified point of the MyPoint type.*/
   public double distance(MyPoint myPoint) {
   	return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
   }

   /**Returns the distance from this point to another point with specified x,y coordinates.*/
 	public double distance(double x, double y) {
 		return distance(new MyPoint(x, y));
 	}
}