/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paulmatthew.PROG24178.week1;

/**
 *
 * @author Matthew Paul
 */
public class BottlesOfBeer {
    /**
     * Writes the lyrics of '99 Bottles of Beer on the Wall to the tune of the song.
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        for(int i = 99; i >= 1; i--){
               
                Thread.sleep(6000);
                switch(i){
                    case 1: System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.\n"
                    + "Take one down and pass it around, " + i + " bottles of beer on the wall.");
                    break;
                    default: System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n"
                + "Take one down and pass it around, " + i + " bottles of beer on the wall.");
                }
            }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"
                    + "Go to the store and buy some more, 99 bottles of beer on the wall.");
        }
    }

