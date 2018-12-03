/**
 * TestRectangle.java tests the Rectangle.java class by creating two objects
 * one which does not specify a width and height and another which gives a specific
 * width and height.
 * 
 * @author Murdo Mackenzie 16152522
 */
public class TestRectangle {
    public static void main(String[] args){
        //create a new rectangle object without giving values to the constructor 
        //and print the results by calling various methods
        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle:");
        System.out.println("Width is " +rectangle.getWidth());
        System.out.println("Height is " +rectangle.getHeight());
        System.out.println("The area is " +rectangle.getArea());
        System.out.println("The perimeter is " +rectangle.getPerimeter());
        
        //create another rectangle object this time with different width and height
        //to the default values.
        Rectangle rectangle1 = new Rectangle(4,5.5);
        System.out.println("\nRectangle 1:");
        System.out.println("Width is " +rectangle1.getWidth());
        System.out.println("Height is " +rectangle1.getHeight());
        System.out.println("The area is " +rectangle1.getArea());
        System.out.println("The perimeter is " +rectangle1.getPerimeter());
    }
}
