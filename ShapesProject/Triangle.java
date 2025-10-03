package Projects;


public class Triangle {
	
	//These lines declare the side length variables as doubles.
	private double sideLength1;
	
	private double sideLength2;
	
	private double sideLength3;
	
	private double height;
	
	/**
	 * this constructor is where I give the triangle object 3 side lengths and a height
	 */
	public Triangle (double s1, double s2, double s3, double h) {
		
		sideLength1 = s1;
		
		sideLength2 = s2;
		
		sideLength3 = s3;
		
		height = h;
		
	}
	
	
	
	/**
	 * This method gets the area by using the triangle formula then 
	 * returning the result.
	 */
	public double getArea() {
		
		return 1.0/2*(sideLength2)*height;
		
	}
	
	
	
	/**
	 * This method gets the perimeter by adding the sides together 
	 * then returning the result.
	 */
	public double getPerimeter() {
		
		return sideLength1+sideLength2+sideLength3;
		
	}
	
	
	
	/**
	 * This method gets the base by adding the sides together then 
	 * subtracting the 1 and 3 side length then returning the result.
	 */
	public double getBase() {
		
		return (sideLength1+sideLength2+sideLength3)-sideLength1-sideLength3;
		
	}
	
	
	
	/**
	 * This method simply prints out "All Angles: 180".
	 */
	public static void getAllAngles() {
		
		System.out.println("All Angles: 180");
		
	}
	
	
	
	/**
	 * This prints out that the shape is a triangle
	 */
	public static void stateShape() {
		
		System.out.println("^^^ This is a triangle ^^^");
		
	}
	
}
