/*
 * CircleCalculator.java
   This program calculates the area and circumference of a cicle
   with radius 10
 */
package intro;

/**
 *
 * @author ngsm
 */
public class CircleCalculator {
    
    public static void main(String[] args)
    {
        // declare a variable to store the radius
        final double PI = 3.14159;  // declare the value of PI
   
        double radius = 10; // the radius value is 10
        // perform calvulatrions
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        
         System.out.println("For a circle with radius " + radius);
        System.out.println("THe circumference is " + circumference);
        System.out.println("And the area is "  + area);
    }
}
