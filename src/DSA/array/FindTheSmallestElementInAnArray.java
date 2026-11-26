package DSA.array;
/*
Write a complete Java program that:
1. Takes the size of an array from the user.
2. Accepts all elements using Scanner.
3. Finds the smallest element.
4. Prints the smallest element.

 */

import java.util.Scanner;

public class FindTheSmallestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        double[] array = new double[size];
        for ( int i = 0; i < size; i++){
            System.out.println("Enter element " + (i+1) +": ");
            array[i] = sc.nextDouble();
        }
        double smallest = array[0];
        for ( double element:array){
            if(smallest > element){
                smallest = element;
            }
        }
        System.out.println("largest:" + smallest);
    }
}
