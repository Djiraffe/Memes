/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulmatthew.PROG24178.week2;

/**
 *
 * @author matth
 */
public class CalculateTipMethod {

    /**
     *
     * @param total
     * @param tipPercent
     */
    public static void calculateTip(double total, double tipPercent){
        double tipAmount = (total * tipPercent) / 100;
        double finalTotal = tipAmount + total;
        System.out.printf("The tip amount is $%.2f and the total is $%.2f\n", tipAmount , finalTotal);
    }
    
}
