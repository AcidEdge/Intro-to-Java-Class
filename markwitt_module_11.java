/*
 * Mark Witt
 * CSD-320
 * Module 11 Assignemnt
 * 12/10/22
 * write methods using specified headers that return the location of the largest and smallest element in a 
 * multidimensional array, returning a one dimensional array that contains the two location elements. 
 */

import java.util.Random;

public class markwitt_module_11 {
    
public static int [] locateLargest (double [][] array){
    double high = Double.MIN_VALUE;
    int location[] = new int[2];
    for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            if (high <= array[i][j]){
                high = array[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

public static int [] locateLargest (int [][] array){
    int high = Integer.MIN_VALUE;
    int location[] = new int[2];
    for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            if (high <= array[i][j]){
                high = array[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

public static int [] locateSmallest (double [][] array){
    double low = Double.MAX_VALUE;
    int location[] = new int[2];
    for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            if (low >= array[i][j]){
                low = array[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;

}

public static int [] locateSmallest (int [][] array){
    int low = Integer.MAX_VALUE;
    int location[] = new int[2];
    for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
            if (low >= array[i][j]){
                low = array[i][j];
                location[0] = i;
                location[1] = j;
            }
        }
    }
    return location;
}

public static void main(String[] args) {
    //create random array sizes:
    Random rand = new Random();
    int i = rand.nextInt(5);
    int j = rand.nextInt(5);
    int x = rand.nextInt(5);
    int y = rand.nextInt(5);
    if(i == 0){i = i+1;}
    if(j == 0){j = j+1;}
    if(x == 0){x = x+1;}
    if(y == 0){y = y+1;}
    //create arrays:
    int[][] intArray = new int [i][j];
    double[][] dubArray = new double [x][y];

    //fill arrays with random numbers:
    for (int a = 0; a < i; a++){
        for (int b =0; b < j; b++){
            intArray[a][b] = rand.nextInt(100);
        }
    }
    for (int a = 0; a < x; a++){
        for (int b =0; b < y; b++){
            dubArray[a][b] = rand.nextDouble();
        }
    }
    
    //print out intArray
    System.out.println("\nRandom intArray["+i+"]["+j+"] contains:");
    for(int a = 0; a < intArray.length; a++){
        for(int b = 0; b < intArray[a].length; b++){
            System.out.print("["+a+"]["+b+"] =" + intArray[a][b] +" ");
        }
        System.out.println();
    }
    //print out intArray largest and smallest values with locations:
    System.out.print("\nThe largest value in intArray[][] is at location: [" + locateLargest(intArray)[0] + "]["+ locateLargest(intArray)[1]+"] ");
    System.out.println(" with a value of " + intArray[locateLargest(intArray)[0]][locateLargest(intArray)[1]]);
    System.out.print("The smallest value in intArray[][] is at location: [" + locateSmallest(intArray)[0]+"]["+ locateSmallest(intArray)[1]+"] ");
    System.out.println(" with a value of " + intArray[locateSmallest(intArray)[0]][locateSmallest(intArray)[1]]);
    
    //print out intArray
    System.out.println("\nRandom doubleArray["+x+"]["+y+"] contains:");
    for(int f = 0; f < dubArray.length; f++){
        for(int g = 0; g < dubArray[f].length; g++){
            System.out.print("["+f+"]["+g+"] =" + dubArray[f][g] +" ");
        }
        System.out.println();
    }
    System.out.print("\nThe largest value in doubleArray[][] is at location: [" + locateLargest(dubArray)[0] + "]["+ locateLargest(dubArray)[1]+"] ");
    System.out.println(" with a value of " + dubArray[locateLargest(dubArray)[0]][locateLargest(dubArray)[1]]);
    System.out.print("The smallest value in doubleArray[][] is at location: [" + locateSmallest(dubArray)[0]+"]["+ locateSmallest(dubArray)[1]+"] ");
    System.out.println(" with a value of " + dubArray[locateSmallest(dubArray)[0]][locateSmallest(dubArray)[1]]);
    System.out.println();
}
}


