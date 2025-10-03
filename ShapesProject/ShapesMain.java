package Projects;

/**
 * Make five different shape classes. Instantiate three different 
 * shapes for each class and test that their methods work. Each class 
 * should have at least two different nonstatic methods and one static 
 * method. Use the Circle object we did in class as an example. 
 */

public class ShapesProject {

	public static void main(String[] args) {
		
		
		//Circle
		System.out.println("------Circle-----\n");
		
		//These lines create new circles using the code from the Circle constructor.
		Circle myCirc1 = new Circle (5.0);
		
		Circle myCirc2 = new Circle (6.0);
		
		Circle myCirc3 = myCirc1;
		
		//These lines print out the reference code for all three circles that were created using the constructor.
		System.out.println(myCirc1 + "\n"); 
		
		System.out.println(myCirc2 + "\n"); 
		
		System.out.println(myCirc3 + "\n");
		
		//This line prints out the radius for myCirc1 using code from the Circle class constructor.
		System.out.println(myCirc1.getRadius() + "\n");
		
		
		//This line sets the new radius for myCirc1 by using the dot operator to call the setRadius method from the circle constructor.
		myCirc1.setRadius(7.0);
		
		//This line prints out the radius for myCirc1 using code from the Circle class constructor.
		System.out.println("Radius: " + myCirc1.getRadius());
		
		//This line prints out the circumference for myCirc1 using code from the Circle class constructor.
		System.out.println("Circumference: " + myCirc1.getCircumf());
		
		//This line prints out the area for myCirc1 using code from the Circle class constructor.
		System.out.println("Area: " + myCirc1.getArea());
		
		//This line prints out the degrees for myCirc1 using code from the Circle class constructor.
		System.out.println("Degrees: " + Circle.getDegrees());
		
		//This code states that the shape is a circle
		System.out.print("\n");
		Circle.stateShape();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		//Square
		System.out.println("-----Square-----\n");
		
		//These lines create new squares using the code from the Square constructor.
		Square squareOne = new Square (5.0);
		
		Square squareTwo = new Square (4.6);
		
		Square squareThree = new Square (8.4);
		
		//This line prints out the Area for squareOne using code from the Square class constructor.
		System.out.println("Area: " + squareOne.getArea());
		
		//This line prints out the Perimeter a for squareTwo using code from the Square class constructor.
		System.out.println("Perimeter: " + squareTwo.getPerimeter());
		
		//This line prints out the sum of all the inside angles for squares using code from the Square class constructor.
		System.out.println("All angles: " + Square.getInsideAngles());
		
		//This line prints out the angel of one of the corners using code from the Square class constructor.
		System.out.println("One angle: " + Square.getOneCorner());
		
		//This code states that the shape is a square
		System.out.print("\n");
		Square.stateShape();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
	
		
		//Triangle
		System.out.println("-----Triangle-----\n");
		
		//These lines create new triangle using the code from the triangle constructor.
		Triangle triOne = new Triangle (3,5,2,4);
		
		Triangle triTwo = new Triangle (4,6,3,5);
		
		Triangle triThree = new Triangle (2,4,1,3);
		
		//This line prints out the Area for triOne using code from the Triangle class constructor.
		System.out.println("Area: " + triOne.getArea());
		
		//This line prints out the Perimeter for triTwo using code from the Triangle class constructor.
		System.out.println("Perimeter: " + triTwo.getPerimeter());
		
		//This line prints out the Base for triThree using code from the Triangle class constructor.
		System.out.println("Base: " + triThree.getBase());
		
		//This line prints out all the angles added together for a triangle using code from the Triangle class constructor.
		Triangle.getAllAngles();
		
		//This code states that the shape is a triangle
		System.out.print("\n");
		Triangle.stateShape();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		//Sphere
		System.out.println("-----Sphere-----\n");
		
		//These lines create a new sphere using the code from the sphere constructor.
		Sphere ballOne = new Sphere(120);
		
		Sphere ballTwo = new Sphere(16);
		
		Sphere ballThree = new Sphere(21);
		
		//This line prints out the diameter for ballOne using code from the Sphere class constructor.
		System.out.println("Dianameter: " + ballOne.getDiameter());
		
		//This line prints out the surface area for ballTwo using code from the Sphere class constructor.
		System.out.println("Surface Area: " +ballTwo.getSurfaceArea());
		
		//This line prints out the volume for ballThree using code from the Sphere class constructor.
		System.out.println("Volume: " + ballThree.getVolume());
		
		//This code states that the shape is a triangle
		System.out.print("\n");
		Sphere.stateShape();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		
		
		//Rectangle
		System.out.println("-----Rectangle-----\n");
		
		//These lines create a new rectangle using the code from the rectangle constructor.
		Rectangle rectOne = new Rectangle (30,20);
		
		Rectangle rectTwo = new Rectangle (5,2);
		
		Rectangle rectThree = new Rectangle (100,50);
		
		//This line prints out the Area for rectOne using code from the rectangle class constructor.
		System.out.println("Area: " + rectOne.getArea());
		
		//This line prints out the Perimeter for rectTwo using code from the rectangle class constructor.
		System.out.println("Perimeter: " + rectTwo.getPerimeter());
		
		//This line prints out the Corner Angle for rectThree using code from the rectangle class constructor.
		System.out.println("One angle: " + rectThree.getCornerAngle());
		
		//This line prints out the all the angles added together for a rectangle using code from the rectangle class constructor.
		System.out.println("All angles: " + Rectangle.getAllAngles());
		
		//This code states that the shape is a rectangle
		System.out.print("\n");
		Rectangle.stateShape();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
			
	}
}
