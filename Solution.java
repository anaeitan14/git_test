import java.io.*;
import java.util.*;


public class Solution { //class name

    public static void main(String[] args) { //beggining of program
    
        Scanner in = new Scanner(System.in); //declaring an input scanner
        
        
        int numberOfElements = in.nextInt(); // declaring an int that will recieve the                                                   next int input from user via scanner we                                                  declared last line
        
        int array[] = new int[numberOfElements]; // declaring an array thats elements                                                        are the ones we recieved from user                                                       last line
        
        int sumOfArray = 0; // declaring an int that will be our starting point for our                                 loop
        
        for(int i = 0; i < numberOfElements; i++) { // starting point i = 0, numberofelements if user int we scanned, aslong as its bigger than i which is 0, i++ add one to int i.
            
        
            array[i] = in.nextInt(); // i is input of user therfore aslong as its smaller than the numbers of elements stored in our array in otherwords length of our array.
            sumOfArray += array[i]; //sum of array is the user input nums added
        }
        System.out.println(sumOfArray); //prints sum

        in.close();
    }
}