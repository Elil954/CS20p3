package skillbuilders;

class CircleClient 
{
    public static void main(String[] args)
    {
        
        // Create a new Circle object named spot
        Circle spot = new Circle();
        
        // Set the radius to 3
        spot.setRadius(3);
        
        // Display the radius
        System.out.println("Circle radius: " + spot.getRadius());
        
        // Display the circumference
        System.out.println("Circle circumference: " + spot.circumference());
        
        // Display the area
        System.out.println("Circle area: " + spot.area());
    }
}
