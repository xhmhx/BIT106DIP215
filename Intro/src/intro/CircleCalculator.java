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
        
         System.out.print("For a circle with radius ");
        System.out.println(radius);
        System.out.print("THe circumference is ");
        System.out.println(circumference);
        System.out.print("And the area is ");
        System.out.println(area);
    }
}
