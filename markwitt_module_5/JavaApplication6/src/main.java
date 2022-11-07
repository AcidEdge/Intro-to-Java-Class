/*
 * Mark Witt
 * CSD-310
 * Module 5
 * Assignment 5.2
 * Program using while loops to display given math operation in smaller to larger and larger to smaller order,
 * and display mathematical results.
 */

import java.util.concurrent.TimeUnit;  //imported for timing of output

public class main {
    //create variables:
    static double smallToLarge = 3;
    static double largeToSmall = 99;
    static double answer1 = 0;
    static double answer2 = 0;

    public static void main(String[] args) throws InterruptedException {
        
        //while loop for small to large
        while (smallToLarge < 100){
            while (smallToLarge < 98){      //while loop for cleaner output (last of the series will have different output to remove the + at end)
                System.out.println("1/" + smallToLarge + "\n+");
                answer1 = answer1 + (1/smallToLarge);
                smallToLarge = smallToLarge + 2;
                TimeUnit.MILLISECONDS.sleep(25);
            }
            System.out.println("1/" + smallToLarge + "\n----------");       //last of series, will display line instead of "+" sign
            answer1 = answer1 + (1/smallToLarge);
            smallToLarge = smallToLarge + 2;
        }
        System.out.println("Answer is: " + answer1 + "\n\n");       //print mathematical answer then pause 2 seconds to read
        TimeUnit.SECONDS.sleep(2);
        
        while (largeToSmall > 2){
            while (largeToSmall > 3){       //while loop for cleaner output (last of the series will have different output to remove the + at end)
                System.out.println("1/" + largeToSmall + "\n+");
                answer2 = answer2 + (1/largeToSmall);
                largeToSmall = largeToSmall - 2;
                TimeUnit.MILLISECONDS.sleep(25);
                }
            System.out.println("1/" + largeToSmall + "\n----------");        //last of series, will display line instead of "+" sign
            answer2 = answer2 + (1/largeToSmall);
            largeToSmall = largeToSmall - 2;
        }
        
        System.out.println("Answer is: "+ answer2);     //print large to small mathematical answer

        System.out.println("-----------------------------------");      //line seperator
        System.out.println("Small to Large Answer is: " + answer1);         //small to large answer (side by side)
        System.out.println("Large to Small Answer is: " + answer2 + "\n\n\n");  //large to small answer (side by side) with extra lines for cleaner reading
    }
    
}
