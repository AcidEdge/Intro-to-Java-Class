/*
 * Mark Witt
 * csd-320
 * module 10 assignment
 * Write four overloaded methods that return the average of an array with the following headers:
 * public static short average(short [] array)
 * public static int average(int [] array)
 * public static long average(long [] array)
 * public static double average(double [] array)
 * 
 * NOTE: this app requires command line arguments to display the arrays. 
 * command line argument syntax is: <arg> <value(as int)> where value is desired length of array 
 * Arguments:
 * -s : display short [] array with a length of <value>
 * -i : display int [] array with a length of <value>
 * -l : display long [] array with a length of <value>
 * -d : display double [] array with a length of <value>
 * -h : displays help/argument options
 * Arrays are populated with randomly generated numbers. 
 * IF using and IDE, arguments can be set by changing 'args' in launch.json, located in the .vscode folder.
 * There is no limit/restriction on the number of <arg> <value> combinations, it will run as many as are provided.
 * 
 */

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.text.NumberFormat;


public class App {
    //ansi color setups: (for using different text colors)
    public static final String ansiReset = "\u001B[0m";
    public static final String ansiRed = "\u001B[31m";
    public static final String ansiGreen = "\u001B[32m";
    public static final String ansiYellow = "\u001B[33m";
    public static final String ansiBlue = "\u001B[34m";
    public static final String ansiItalic = "\u001B[3m";

    //formatting for long and double values - used in output formatting
    static NumberFormat nf = NumberFormat.getInstance(Locale.US);
    //clear screen method:
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");      //clear screen with ASCii sequence
        System.out.flush();       
    }

    //average short array method
    public static short average(short [] array){
        //returns average of short[]
        short result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        result /= array.length;
        return result;
    }

    //average int array method
    public static int average(int [] array){
        //returns average of int[]
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        result /= array.length;
        return result;
    }

    //average long array method
    public static long average(long [] array){
        //returns average of long[]
        long result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        result /= array.length;
        return result;
    }
    
    //average double array method
    public static double average(double [] array){
        //returns average of double[]
        double result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        result /= array.length;
        return result;
    }

    //method to create arrays:
    public static short[] createArray(short arrayLength, short maxValue){
        Random rand = new Random();
        short[] shortArray = new short[arrayLength];
        for(int i = 0; i < shortArray.length; i++){
            Integer value = rand.nextInt(maxValue);
            shortArray[i] = value.shortValue();
        }
        System.out.println("\nThe short array contains:");
        for(int i = 0; i < shortArray.length; i++){
            if(i == shortArray.length-1){
                System.err.print(shortArray[i] + "\n");
            }
            else{
            System.out.print(shortArray[i] + ", ");
            }
        }
        short [] sorted = shortArray;
        Arrays.sort(sorted);
        System.out.println("The short array sorted:");
        for(int i = 0; i < sorted.length; i++){
            if(i == sorted.length-1){
                System.out.print(sorted[i] + "\n");
            }
            else{
            System.out.print(sorted[i] + ", ");
            }
        }
        return shortArray;
    }

    public static int[] createArray(int arrayLength, int maxValue){
        Random rand = new Random();
        int[] intArray = new int[arrayLength];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = rand.nextInt(maxValue);
        }
        System.out.println("\nThe integer array contains:");
        for(int i = 0; i < intArray.length; i++){
            if(i == intArray.length-1){
                System.err.print(intArray[i] + "\n");
            }
            else{
            System.out.print(intArray[i] + ", ");
            }
        }
        int [] sorted = intArray;
        Arrays.sort(sorted);
        System.out.println("The integer array sorted:");
        for(int i = 0; i < sorted.length; i++){
            if(i == sorted.length-1){
                System.out.print(sorted[i] + "\n");
            }
            else{
            System.out.print(sorted[i] + ", ");
            }
        }
        return intArray;
    }
    
    public static long[] createArray(long arrayLength, long maxValue){
        Random rand = new Random();
        long[] longArray = new long[(int) arrayLength];
        for(int i = 0; i < longArray.length; i++){
            longArray[i] = rand.nextLong();
        }
        System.out.println("\nThe long array contains:");
        for(int i = 0; i < longArray.length; i++){
            if(i == longArray.length-1){
                System.err.print(nf.format(longArray[i]) + "\n");
            }
            else{
            System.out.print(nf.format(longArray[i]) + ", ");
            }
        }
        long [] sorted = longArray;
        Arrays.sort(sorted);
        System.out.println("The long array sorted:");
        for(int i = 0; i < sorted.length; i++){
            if(i == sorted.length-1){
                System.out.print(nf.format(sorted[i]) + "\n");
            }
            else{
            System.out.print(nf.format(sorted[i]) + ", ");
            }
        }
        return longArray;
    }

    public static double[] createArray(double arrayLength, double maxValue){
        Random rand = new Random();
        double[] doubleArray = new double[(int)arrayLength];
        for(int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = rand.nextDouble();
        }
        System.out.println("\nThe double array contains:");
        for(int i = 0; i < doubleArray.length; i++){
            if(i == doubleArray.length-1){
                System.err.print(nf.format(doubleArray[i]) + "\n");
            }
            else{
            System.out.print(nf.format(doubleArray[i]) + ", ");
            }
        }
        double [] sorted = doubleArray;
        Arrays.sort(sorted);
        System.out.println("The double array sorted:");
        for(int i = 0; i < sorted.length; i++){
            if(i == sorted.length-1){
                System.out.print(nf.format(sorted[i]) + "\n");
            }
            else{
            System.out.print(nf.format(sorted[i]) + ", ");
            }
        }
        return doubleArray;
    }

        
    public static void runProgram(short length){
        short maxValue = 50;
        System.out.println("The short array average is: " + average(createArray(length, maxValue)));
        }
    
    public static void runProgram(int length) {
        int maxValue = 50;
        System.out.println("The integer array average is: " + average(createArray(length, maxValue)));
    }

    public static void runProgram(long length) {
        long maxValue = 50;
        System.out.println("The long array average is: " + nf.format(average(createArray(length, maxValue))));
    }

    public static void runProgram(double length) {
        double maxValue = 50;
        System.out.println("The double array average is: " + nf.format(average(createArray(length, maxValue))));
    }
    
    public static void main(String[] args) {
    clearScreen();
    if(args.length > 0){
        for(int i = 0; i < args.length; i++){
            if(args[i].contains("-s")){
                Short length = Short.parseShort(args[i+1]);
                runProgram(length);
            }
            if(args[i].contains("-i")){
                int intLength = Integer.parseInt(args[i+1]);
                runProgram(intLength);
            }
            if(args[i].contains("-l")){
                long length = Long.parseLong(args[i+1]);
                runProgram(length);
            }
            if(args[i].contains("-d")){
                Double length = Double.parseDouble(args[i+1]);
                runProgram(length);
            }
            if(args[i].contains("-h")){
                System.out.println("Welcome to Mark's CSD-320 Module 9 Assignment.");
                System.out.println(ansiRed + "***This program requries additional command line arguments to run.***" + ansiReset);
                System.out.println("\nThe syntax is: "+ansiBlue+"app.java "+ansiGreen+"<arg>"+ansiYellow+" <value>"+ansiGreen+" <arg>"+ansiYellow+" <value>"+ansiReset+" etc...");
                System.out.println("\nThe "+ansiGreen+"<arg>"+ansiReset+" is the type of array you wish to view");
                System.out.println("The options are:");
                System.out.println("-s : short[] array\n-i : integer[] array\n-l : long[] array\n-d : double[] array");
                System.out.println("\nThe "+ansiYellow+"<value>"+ansiReset+" following each argument is the desired length of that array,\nand all arrays are filled by randomly generated values.");
                System.out.println("\nThere is not limit/restriction on the number of arguments,\nthe program will run as many combinations of "+ansiGreen+"<args>"+ansiYellow+" <values>"+ansiReset+" that you enter.");
                System.out.println(ansiItalic+"\nIF using and IDE, arguments can be set by changing 'args' in launch.json, located in the .vscode folder."+ansiReset);
                System.out.println("\nTo view this help again, run java App "+ansiGreen+"-h"+ansiReset);
            }
        }
    } 
    else {
        System.out.println(ansiRed+"No command line arguments found."+ansiReset+"\nAfter compiling, use 'java "+ansiBlue+"App"+ansiGreen+" -h"+ansiReset+"' for help and a list of available options. ");
    }   
}    
}

