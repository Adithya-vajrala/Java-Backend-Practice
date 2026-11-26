package DSA.array;

/*
Write a Java program that:
1. Takes the array size from the user.
2. Takes all array elements using Scanner.
3. Finds the largest element in the array.
4. Prints the largest element.
 */

import java.util.Scanner;

public class FindTheLargestElementInAnArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            double[] array = new double[size];
            for ( int i = 0; i < size; i++){
                System.out.println("Enter element " + (i+1) +": ");
                array[i] = sc.nextDouble();
            }
            double largest = array[0];
            for ( double element:array){
                if(largest < element){
                    largest = element;
                }
            }
            System.out.println("largest:" + largest);
        }
}
