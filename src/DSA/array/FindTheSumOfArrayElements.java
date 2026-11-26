package DSA.array;

/*
Problem statement

Write a complete Java program that:
1. Takes the size of an integer array from the user.
2. Takes all elements as input using Scanner.
3. Calculates the sum of all array elements using a loop.
4. Prints the final sum.

 */
import java.util.Scanner;
public class FindTheSumOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int i=0;i<size;i++){
            System.out.println("Enter the element "+ (i+1) +" : ");
            array[i] = sc.nextInt();
        }
        for (int element:array){
            sum += element;
        }
        System.out.println("Sum of the array: " + sum);
    }
}
