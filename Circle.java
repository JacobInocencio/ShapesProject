package Projects;

public class Circle {

	//This is where the radius is declared a double.
	private double radius;
	
	//This is where the variable pi is declared the value of pi
	private final double pi = Math.PI;
	
	/**
	 * This gives the circle that is created a radius
	 */
	public Circle (double r) {
		
		radius = r;
		
	}
	
	
	
	/**
	 * This method returns the radius for the circle
	 */
	public double getRadius() {
		
		return radius;
		
	}
	
	
	
	/**
	 * This method sets the radius of a circle to a new radius.
	 */
	public void setRadius(double newRadius) {
		
		radius = newRadius;
		
	}
	
	
	
	/**
	 * This method returns the circumference of any given circle.
	 */
	public double getCircumf() {
		
		return (2*pi*radius);
		
	}
	
	
	
	/**
	 * This method returns the area of any given circle.
	 */
	public double getArea() {
		
		return (pi * radius * radius);
		
	}
	
	
	
	/**
	 * This method returns the degrees of any given circle.
	 */
	public static int getDegrees() {
		
		return 360;
		
	}
	
	
	
	/**
	 * This method states the shape of any given circle.
	 */
	public static void  stateShape() {
		
		System.out.println("^^^ This is a circle ^^^");
		
	}
	
}
