/**
 *  Rectangle.java allows for the creation of a rectangle object with a width
 *  and height. Methods are also included to calculate and return the area and
 *  the perimeter of a rectangle object.
 * 
 * @author Murdo Mackenzie 16152522
 */
public class Rectangle {
    //create our data fields as instance variables and make private with a default value of 1
    private double width = 1;
    private double height = 1;
    
    //no-arg constructor
    public Rectangle() {
    }
    
    //constructor with arguments for width and height
    public Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }
    
    //return width
    public double getWidth(){
        return width;
    }
    
    //return height
    public double getHeight(){
        return height;
    }
    
    //return area
    public double getArea(){
        return width * height;
    }
    
    //return perimeter
    public double getPerimeter(){
        return 2 * (width + height);
    }
}
