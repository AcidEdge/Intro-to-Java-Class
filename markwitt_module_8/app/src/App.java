/*
 * Mark Witt
 * CSD-320
 * Module 8
 * program with 4 methods for calculating the cost of a yearly service visit, with all method titled (yearlyService),
 * but all methods accept different parameters
 */

import java.text.NumberFormat;
import java.util.Locale;

public class App {

    // Set up variables for program:
    static NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    static NumberFormat percent = NumberFormat.getPercentInstance(new Locale("en", "US"));
    static double yearlyServiceCharge = 99.99;      
    static double oilChangeFee = 29.99;
    static double tireRotationFee = 15.99;
    static double couponAmount = 15;        //coupon discount in percent
    public static final String ansiReset = "\u001B[0m";
    public static final String ansiRed = "\u001B[31m";
    public static final String ansiGreen = "\u001B[32m";
    public static final String ansiYellow = "\u001B[33m";
    public static final String ansiBlue = "\u001B[34m";

    //main method that will test each of these methods two times
    public static void main(String[] args) throws Exception {
        //use for loop to run through / test methods twice
        for (int x = 0; x < 2; x++){
            System.out.println(ansiBlue + "\n\nCost of Yearly Auto Service Vist Options:\n" + ansiReset);
            yearlyService();
            yearlyService(oilChangeFee);
            yearlyService(oilChangeFee, tireRotationFee);
            yearlyService(oilChangeFee, tireRotationFee, couponAmount);
        }
    }
    
    //yearlyService(no parameters) - Will return the standard service charge.
    public static void yearlyService(){
        System.out.println(ansiYellow + "Standard Service Only:" + ansiReset);
        System.out.println("Standard Yearly Service charge: " + ansiRed + currency.format(yearlyServiceCharge) + ansiReset);
        System.out.println("---------------------------------------------------------------------");
    }

    //yearlyService(one parameter) - Will return the standard service charge with an added oil change fee.
    public static void yearlyService(double oilChangeFee){
        double totalCost = yearlyServiceCharge + oilChangeFee;
        System.out.println(ansiYellow + "Silver Service With: Standard Service & Oil Change:" + ansiReset);
        System.out.println("Standard Yearly Service charge: " + currency.format(yearlyServiceCharge));
        System.out.println("Oil Change fee: " + currency.format(oilChangeFee));
       
        System.out.println("Total Cost: " + ansiRed + currency.format(totalCost) + ansiReset);       
        System.out.println("---------------------------------------------------------------------"); 
    }

    //yearlyService(two parameters) - Will return the standard service charge with an added oil change fee and a tire rotation charge.
    public static void yearlyService(double oilChangeFee, double tireRotationFee){
        double totalCost = yearlyServiceCharge + oilChangeFee + tireRotationFee;
        System.out.println(ansiYellow + "Gold Service With: Standard Service, Oil Change & Tire Rotation:" + ansiReset);
        System.out.println("Standard Yearly Service charge:" + currency.format(yearlyServiceCharge));
        System.out.println("Oil Change fee: " + currency.format(oilChangeFee));
        System.out.println("Tire Rotation fee:  " + currency.format(tireRotationFee));
        
        System.out.println("Total Cost: " + ansiRed + currency.format(totalCost) + ansiReset);  
        System.out.println("---------------------------------------------------------------------"); 
    }

    //yearlyService(three parameters) - Will return the standard service charge with an added oil change fee, 
    //a tire rotation charge, along with a coupon amount that will be deducted from the total cost.
    public static void yearlyService(double oilChangeFee, double tireRotationFee, double couponAmount){
        double totalCost = yearlyServiceCharge + oilChangeFee + tireRotationFee;
        double couponDiscount = (totalCost * (couponAmount / 100));
        double finalCost = totalCost - couponDiscount;
        double couponPercent = couponAmount / 100;
        System.out.println(ansiYellow + "Platinum Service With: Standard Service, Oil Change, Tire Rotation & Coupon Discout:" + ansiReset);
        System.out.println("Standard Yearly Service charge: " + currency.format(yearlyServiceCharge));
        System.out.println("Oil Change fee: " + currency.format(oilChangeFee));
        System.out.println("Tire Rotation fee: " + currency.format(tireRotationFee));
        System.out.println("Coupon Discout: " + ansiGreen + currency.format(couponDiscount) + " (" + percent.format(couponPercent) + ")" + ansiReset);
        
        System.out.println("Total Cost: " + ansiRed +  currency.format(finalCost) + ansiReset);  
        System.out.println("---------------------------------------------------------------------"); 
 
    }    
}
