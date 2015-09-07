/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataTypes;
import java.util.Scanner;
/**
 *
 * @author ngsm
 */
public class GSTcalculator {
    
    public static void main(String[] args)
    {
        // declare constant to represent GSTRATE
        final double GSTRATE = 0.075;
        Scanner sc = new Scanner(System.in);
        
       // Ask user for the name of the product and the 
        // quantiy and price per unit
        // then show the GST on the total and the grand total
        
        System.out.print("Enter product name :");
        String productName = sc.nextLine();
        System.out.print("Enter price per unit : RM");
        double price = sc.nextDouble();
        System.out.print("Enter number of units purchased :");
        int qty = sc.nextInt();
        
        // calculate subtotal
        double subTotal = price * qty;
        double GST = subTotal * GSTRATE;
        
        double totalToPay = subTotal + GST;
        
        System.out.println("GST : RM" + GST  + "(" + (GSTRATE*100) + "%)");
        System.out.println("Please pay RM" + totalToPay);
        
    }
}
