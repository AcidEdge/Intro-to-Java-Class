/**
 * Mark Witt
 * CSD 320 
 * Module 1 Assignment
 * 10/17/22
 */
public class main {  //Create main class
    
    public double getDoubleValue(){ // create float value method
        double doubleValue = 4.0 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0 + 1.0/13.0);
        return doubleValue;
    }
    public int getIntValue(){  //create int value method
        int intValue = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);
        return intValue;
    }

    public static void main(String[] args) {
        
        //create string that displays math problem:
        String mathProblem1 = "4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )";
        String mathProblem2 = "4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)";
        String mathPreview = String.format("%s%n%s%n%s%n%s%n", "For the given math problem:",mathProblem1,"Also written as:",mathProblem2 );
        
        //Print all outputs:
        System.out.println(mathPreview); // print math problem string
        System.out.println("The results are:");
        System.out.println("Float Value: "+new main().getDoubleValue());  //print line with float value results
        System.out.println("Int Value: "+new main().getIntValue());      //print line with int value results

    }
    
}
/** Assignment Comments:
 * Given the math problem presented uses division of fractions, using and int
 * variable type will not return an accurate result. 
 * To get an actual accurate result for the math problem, it needs to have
 * decimal numbers, not a whole numbered answer, so we need to use a float or double
 * variable type to get the accurate result we are looking for. 
 * Also important is the decimal places when inputting the math problem, so we 
 * can still get an exact answer.
 */