/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulmatthew.PROG24178.week1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author matth
 */
public class GameKeyboard {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //try {
            Scanner scan = new Scanner(System.in);
            int moveValue = 1;
            System.out.println("Using the numberpad, move your character.");
            do {
                try {
                System.out.println(">");
                moveValue = scan.nextInt();
                if ((moveValue == 1) || (moveValue == 3) || (moveValue == 7) || (moveValue == 9)) {
                    System.out.println("Diagonal moves are not allowed!");
                } else {
                    switch (moveValue) {
                        case 2:
                            System.out.println("Move Down");
                            break;
                        case 4:
                            System.out.println("Move Left");
                            break;
                        case 6:
                            System.out.println("Move Right");
                            break;
                        case 8:
                            System.out.println("Move Up");
                            break;
                        default:
                            System.out.println("Bad Input!");
                            break;
                    }
                }
                }catch (InputMismatchException e) {
                    System.out.println("Bad Input!");
                } 
                
                
            } while (moveValue != 0);
        }
        //catch (InputMismatchException e) {
                   // System.out.println("Bad Input!");
       // }
    }


