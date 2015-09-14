/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selection;
import java.util.*;

/**
 * a Java program that will ask the user for two numbers and then perform the required operation:
 * '+'  to add the two numbers
 * '-'  to subtract the second number from the first
 * '*' to find the product
 * '/' to divide the first number by the second
 * '%' to find the remainder
 * '^' to find the first number to the power of the second

 * @author ngsm
 */
public class Arithmetic {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first integer :");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd integer :");
        int num2 = sc.nextInt();
        
        System.out.println("Would you like to: ");
        System.out.println("+: Add the numbers");
        System.out.println("-: Subtract second from first");
        System.out.println("*: Find the product");
        System.out.println("/: Find the quotient");
        System.out.println("%: Find the remainder");
        System.out.println("^: First number to the power of second");
        System.out.print("Enter the operation :");
        char op = sc.next().charAt(0);
        
        int ans =0;
        
        // use switch to perform the required operation
        switch (op)
        {
            case '+': ans = num1 + num2; break;
            case '-': ans = num1 - num2; break;
            case '*': ans = num1 * num2; break;
            case '/': ans = num1 / num2; break;
            case '%': ans = num1 % num2; break;
            case '^': ans = (int) Math.pow(num1, num2); break;
        }
        System.out.println("The answer is " + ans);
        
        
    }
}
