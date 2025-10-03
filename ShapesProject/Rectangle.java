package Projects;


public class Rectangle {

	//This is where the side lengths are declared as doubles.
	private double sideLengthW;
	
	private double sideLengthH;
	
	
	
	/**
	 * This method uses the parameters that are given and assigns them to the variables for side lengths.
	 */
	public Rectangle (double h, double w) {
		
		sideLengthH = h;
		
		sideLengthW = w;
		
	}
	
	
	
	/**
	 * This method returns the area by multiplying the side lengths by each other.
	 * @return
	 */
	public double getArea() {
		
		return sideLengthW*sideLengthH;
		
	}
	
	
	
	/**
	 * This method returns the perimeter by multiplying both side lengths by 2 and adding both together.
	 * @return
	 */
	public double getPerimeter() {
		
		return (2*sideLengthH)+(2*sideLengthW);
		
	}
	
	
	
	/**
	 * This method returns the angle of one corner of the rectangle
	 */
	public double getCornerAngle() {
		
		return 90;
				
	}
	
	
	
	/**
	 * This method returns the sum of all the inside angles of the rectangle.
	 * @return
	 */
	public static int getAllAngles() {
		
		return 360;
		
	}
	
	
	
	/**
	 * This prints out that the shape is a rectangle
	 */
	public static void stateShape() {
		
		System.out.println("^^^ This is a Rectangle ^^^");
		
	}
	
	
}
