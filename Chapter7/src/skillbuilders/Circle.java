package skillbuilders;

public class Circle 
{
	

	    
	    // Private member to store the radius
	    private double radius;

	    // --- Accessor and Mutator Methods ---
	    
	    /** Sets the radius of the circle. */
	    public void setRadius(double r)
	    {
	        radius = r;
	    }

	    /** Returns the current radius of the circle. */
	    public double getRadius()
	    {
	        return radius;
	    }

	    // --- Calculation Methods ---

	    /** Calculates and returns the circumference (2 * pi * r). */
	    public double circumference() 
	    {
	        // C = 2 * pi * radius
	        return 2 * Math.PI * radius;
	    }
	    
	    /** Calculates and returns the area (pi * r^2). */
	    public double area() 
	    {
	        // A = pi * radius^2
	        return Math.PI * radius * radius;
	        // Alternatively: return Math.PI * Math.pow(radius, 2);
	 
	    
	    }
}





