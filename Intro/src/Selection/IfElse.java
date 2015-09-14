/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selection;
import java.util.*;
/**
 *
 * @author ngsm
 */
public class IfElse {
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value :");
        double val = sc.nextDouble();
        
        if (val >=0)
        {
            double ans = Math.sqrt(val);
            System.out.print("The square root of " + val);
            System.out.println(" is " + ans);
        }
        else
            System.out.println("Cannot find square root of negative number");
        
    }
}
