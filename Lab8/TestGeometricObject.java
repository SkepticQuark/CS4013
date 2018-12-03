import java.util.*;
public class TestGeometricObject{
	public static void main(String [] args){
		ArrayList <GeometricObject> shapes = new ArrayList<GeometricObject>();
		
		GeometricObject o1 = new Rectangle(25,60);
		GeometricObject o2 = new Rectangle(15,40);
		GeometricObject o3 = new Circle(8);
		GeometricObject o4 = new Circle(4);
		GeometricObject o5 = new Square(6);
		
		shapes.add(o1);
		shapes.add(o2);
		shapes.add(o3);
		shapes.add(o4);
		shapes.add(o5);
		
		for (GeometricObject g : shapes){
			if (g instanceof Colorable){
				Square s = (Square) g;
				s.howToColor();
			}
		}
		System.out.println(GeometricObject.max(o1,o2).toString());
		System.out.print(GeometricObject.max(o3,o4).toString());
	}
}