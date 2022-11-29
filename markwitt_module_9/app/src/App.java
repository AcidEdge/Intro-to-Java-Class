/*
 * Mark Witt
 * csd-320
 * module 9 assignment
 * Java Arrays
 * Write a program that reads and fills an array with 20 integers. 
 * Then, using the array elements, calculate the data to find and display:
 * 11/29/22
 */

 //imports:
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;


public class App {

    //setup decimal formatting:
    final static DecimalFormat dec = new DecimalFormat("0.00");

    //clear screen method
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");      //clear screen with ASCii sequence
        System.out.flush();       
    }

    //run program again method, including run again menu: menu also handles invalid input exceptions
    public static void runAgain(){
        
        try (Scanner runAgain = new Scanner(System.in)) {
            System.out.println("\n\nWould you like to run Array Checker again?");
            System.out.print("1. Yes\n2. No\n>> ");
            try{
                int runAgainChoice = runAgain.nextInt();
                if (runAgainChoice == 1){
                    clearScreen();
                    mainMenu();
                }
                else if (runAgainChoice == 2){
                    System.out.println("\n\nThank you. Goodbye!");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid Option, please try agian.");
                    runAgain();
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input, please try again.");
                runAgain();
            }
        }
    }

    //output method, displays output of array, sorted array,
    //highest, lowest, average, and sum values of chosen array
    //float used for average value, and formatted with decimal formatter created after imports
    public static void output(int[] array){
        clearScreen();

        System.out.println("Your array contains: ");
        for(int i = 0; i < array.length; i++){
            if(i == array.length-1){
                System.err.print(array[i] + "\n");
            }
            else{
            System.out.print(array[i] + ", ");
            }
        }
        int[] sorted = new int[20];
        sorted = array;
        Arrays.sort(sorted);
        System.out.println("Your sorted array contains: ");
        for(int i = 0; i < sorted.length; i++){
            if(i == sorted.length-1){
                System.err.print(sorted[i] + "\n");
            }
            else{
            System.out.print(sorted[i] + ", ");
            }
        }
        System.out.println("\n\nThe highest value in the array is: " + highest(array));
        System.out.println("The smallest value in the array is: " + lowest(array));
        System.out.println("The average value in the array is: " + dec.format(average(array)));
        System.out.println("The total of all values in the array is: " + sum(array));
        runAgain();
    }

    //generates then returns a random array
    public static int[] randomArray(){
        int[] randArray = new int[20];
            Random rand = new Random();
        for(int i = 0; i < randArray.length; i++){
            randArray[i] = rand.nextInt(100);
        }
        return randArray;
    }

    //Creates user array by getting user input for each space in array, then returns the array
    public static int[] userArray(){
        clearScreen();
        int[] usersArray = new int[20];
        System.out.println("This program uses an array length of 20.");
        System.out.println("Please enter numbers to fill the array,");
        System.out.println("one number at a time.");
        Scanner input = new Scanner(System.in);
            for(int i =0; i < usersArray.length; i++){
                System.out.print("Choice " + (i+1) + ">> ");
                try{
                    usersArray[i] = input.nextInt();
                }
                catch (InputMismatchException e){
                    System.out.println("Invalid Input, please try agian.");
                }
            }
        return usersArray;
    }

    //iterates through array, returning highest value within array
    static int highest(int[] array){
        int high = Integer.MIN_VALUE;
        for (int i : array){
            if (high < i){
                high = i;
            }
        }
        return high;
    }

    //iterates through array, returning lowest value within array
    static int lowest(int[] array){
        int low = Integer.MAX_VALUE;
        for (int i : array){
            if (low > i){
                low = i;
            }
        }
        return low;
    }

    //iterates through array, getting array sum and divide by length to get array average, returns average
    //used float to get accurate decimal number of the average. 
    //decimal format used in output to limit decimal places
    static float average(int[] array){
        float avg = 0;
        for (int i = 0; i < array.length; i++){
            avg += (float)array[i];
        }
        avg /= array.length;
        return avg;
    }

    //iterates through array, adding up sum of array elements, returns array
    static int sum(int[] array){
        int sum = 0;
        for (int i=0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    //main menu, provides options for random array or user input array and exit.
    //also handles invalid input exceptions.
    public static void mainMenu(){
        try (Scanner mainMenuInput = new Scanner(System.in)) {
            System.out.println("Welcome to the TK-Mark Array Checker.");
            System.out.println("Please choose from the following options:");
            System.out.print("1. Use randomly generated array\n2. Create array from user input.\n3. Exit program\nChoice: ");
            try{
                int mainChoice = mainMenuInput.nextInt();
                if (mainChoice == 1){
                    output(randomArray()); //calls the output method using the array returned by random method
                }
                else if (mainChoice == 2){
                    output(userArray());  //call the output method using the array created/returned by user input method
                }
                else if (mainChoice == 3){      //exit program option
                    System.out.println("\n\nThank you. Goodbye!");
                    System.exit(0);
                }
                else {
                    System.out.println("\nInvalid Option, please try agian.\n");
                    mainMenu();
                }
            }
            catch (InputMismatchException e){
                System.out.println("\nInvalid input, please try again.\n");
                mainMenu();
            }
        }

    }
    //main method, runs program...clears screen then starts main menu
    public static void main(String[] args) throws Exception {
        clearScreen();
        mainMenu();
    }
}
