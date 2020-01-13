/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulmatthew.PROG24178.week1;
import java.util.Scanner;
/**
 * Given a tip percentage and bill amount program will calculate the expected tip as well as the total
 * dollar value of the bill.
 * @author matth
 */
public class CalculateTip {
     /**
         * Given a tip percentage and bill amount program will calculate the 
         * expected tip as well as the total dollar value of the bill.
     * @param total
     * @param tipPercent
         */
    /*public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your bill amount to calculate a tip. > ");
        double total = scan.nextDouble();
        System.out.println("Please enter the tip percentage (%) > ");
        int tipPercent = scan.nextInt();
        //tipPercent /= 100;
        double tipAmount = (total * tipPercent) / 100;
        double finalTotal = tipAmount + total;
        System.out.printf("The tip amount is $%.2f and the total is $%.2f\n", tipAmount , finalTotal);
        */
    public static void CalculateTip(double total, double tipPercent){
        double tipAmount = (total * tipPercent) / 100;
        double finalTotal = tipAmount + total;
        System.out.printf("The tip amount is $%.2f and the total is $%.2f\n", tipAmount , finalTotal);
    }
}
