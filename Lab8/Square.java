public class Square extends GeometricObject implements Colorable{
	protected double length;
	// Default constructor
	public Square(){
		this(1.0,"white",1.0);
	}
	
	// Construct square with specified length
	public Square(double length){
		super("white", 1.0);
		this.length = length;
	}
	
	// Construct square with specified length, colour and weight
	public Square(double length, String color, double weight){
		super(color,weight);
		this.length = length;
	}
	
	// Getter method for length
	public double getLength(){
		return length;
	}
	
	// Setter method for length
	public void setLength(double length){
		this.length = length;
	}
	
	// Implement the getArea method defined in GeometricObject
	@Override
	public double getArea(){
		return length * length;
	}
	
	// Implement the getPerimeter method defined in GeometricObject
	@Override
	public double getPerimeter(){
		return 4 * length;
	}
	
	// Implement the equals method defined in GeometricObject
	@Override
	public boolean equals(Object o){
		boolean equals = false;
		Square s = (Square) o;
		if (this.getLength() == s.getLength()){
			equals = true;
		}
	    return equals;
	}
	
	// Implement the toString method defined in GeometricObject
	@Override
	public String toString(){
		return "Length: " + this.getLength() + "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
	}
	
	// Implement the howToColor method
	public void howToColor(){
		System.out.println("Colour all four sides.");
	}
}