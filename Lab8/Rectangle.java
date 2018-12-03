public class Rectangle extends GeometricObject {
  private double width;
  private double height;

    /** Construct a rectangle with width and height */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  /**Return width*/
  public double getWidth() {
    return width;
  }

  /**Set a new width*/
  public void setWidth(double width) {
    this.width = width;
  }

  /**Return height*/
  public double getHeight() {
    return height;
  }

  /**Set a new height*/
  public void setHeight(double height) {
    this.height = height;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return width*height;
  }

  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return 2*(width + height);
  }

  // Implement equals method in GeometricObject
  @Override
  public boolean equals(Object o){
	  boolean equals = false;
	  Rectangle r = (Rectangle) o;
	  if ((this.getWidth() == r.getWidth()) && (this.getHeight() == r.getHeight()))
	  {
		  equals = true;
	  }
	  
	  return equals;
  }
  
  // Implement toString method in GeometricObject
  @Override
    public String toString(){
	  return "Height: " + this.height + " \nWidth: " + this.width + " \nArea: " + this.getArea() + " \nPerimeter: " + this.getPerimeter();
  }
}

