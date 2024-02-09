/*
 * Daniel Rubianes
 * Date: 10/10/18
 * Hendersonville High School
 * Circle 
 * 
 * Description: A java class for creating circle objects
 * Difficulties: None
 * What I learned: How to create custom objects in java
*/
public class danielRubianesMod3Circle
{
    public danielRubianesMod3Circle(double r)
    {
        radius = r;
    }
    
    public double area()
    {
    	double a = Math.PI * radius * radius;
    	return a;
    }
    
    public double circumference()
    {
    	double c = 2 * Math.PI * radius;
    	return c;
    }
    
    public void setRadius(double nr)
    {
    	radius = nr;
    }
    
    public double radius;
}

/*
 * Sample Output: 
 * 125.66370614359172
 */