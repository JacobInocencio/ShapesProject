package Projects;

public class Sphere {
 
	//This declares the radius of the sphere to be a double.
	private double radius;
	
	
	
	/**
	 * This method takes what ever is given in the 
	 * parameter and assigns it to radius
	 */
	public Sphere (double r) {
		
		radius = r;
		
	}
	
	
	
	/**
	 * This method gets the surface area by using the formula 
	 * for finding the area of a sphere and then returning the result.
	 */
	public double getSurfaceArea() {
		
		return 4*(Math.PI)*(radius*radius);
		
	}
	
	
	
	/**
	 * This method gets the volume by using the formula for sphere
	 * volume and returning the result.
	 */
	public double getVolume() {
		
		return (4/3)*(Math.PI)*(radius*radius*radius);
		
	}
	
	
	
	/**
	 * This method gets the diameter by multiplying radius by 2 and 
	 * returning the result.
	 */
	public double getDiameter()
	{
		return 2*(radius);
	}
	
	
	
	/**
	 * This prints out that the shape is a sphere
	 */
	public static void stateShape() {
		
		System.out.println("^^^ This is a sphere ^^^");
		
	}
	
}
