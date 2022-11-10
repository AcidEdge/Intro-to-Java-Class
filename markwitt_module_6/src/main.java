/*
 * Mark Witt
 * CSD-320
 * Assignment for Module 6
 * Write a program that uses nested for loops to output the following with the shown display format:
                                   1               @
                                 1 2 1             @
                               1 2 4 2 1           @
                             1 2 4 8 4 2 1         @
                          1 2 4 8 16 8 4 2 1       @
                       1 2 4 8 16 32 16 8 4 2 1    @
                    1 2 4 8 16 32 64 32 16 8 4 2 1 @

 * Used if/else if statements to adjust spacing on rows with double digit outputs, in order to keep numbers aligned 
 * as in example. initially used # instead of spaces on ouside of pyramid to count spacing and get the correct number
 * of spaces on each side correct. once spacing was correct, replaced # with a blank space. 
 * Noticed almost imediatly numerical values are a base-2 count (incrimental in powers of 2) from previous experiance 
 * with networking/subnetting, so for numerical output went with incrimental and decrimental  powers of 2 output.
 * Used variable p as placeholder variable for 2^p exponent variable, in order incriment and decriment properly. 
 */


public class main {

    public static void main(String[] args) {

        int numOfRows = 7;  //set number of rows
        for(int row =1 ; row<=numOfRows; row++){  //initial for loop, controls full rows
            int p=0;                //initialize numerical output variable (resets on each new row)
            
            if (row <=4){                     //spacing for left side of pyramid. rows 1-4, controls blank spaces 
                for (int column = row-2; column<=numOfRows; column++){
                    System.out.print("  ");  
                }
            }
            else if(row >= 5){                // spacing for left side of pyramid, rows 5-7, controls blank spaces
                for (int column = row-2; column<=numOfRows-2; column++){
                    System.out.print("   ");    
                }
            }
            
            for (int column=1; column<row; column++, p++){       //for loop for left 1/2 (left triangle) of pyramid. 
                System.out.print((int) Math.pow(2, p) +" ");
            }
            for (int column = 1; column<=row; column++, p--){    // for loop for right 1/2 (right triangle) of pyramid.
                System.out.print((int) Math.pow(2, p)+ " ");
            }
            if (row <= 5){                        //spacing for right side of pyramid, rows 1-5, controls blank spacing
                for (int column = row; column<=numOfRows; column++){
                    System.out.print("  ");     
                }
            }
            else if (row > 5){                    //spacing for right side of pyramid, rows 6-7, controls blank spacing
                for (int column = row; column<=numOfRows-1; column++){
                    System.out.print("   ");
                }
            }
            System.out.println("@");        //adds @ symbol and new line, last part of each row
        }
    }
}
    

