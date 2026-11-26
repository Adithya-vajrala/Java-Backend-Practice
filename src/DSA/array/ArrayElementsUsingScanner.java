package DSA.array;

import java.util.Scanner;

public class ArrayElementsUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0;i < n; i++){
            System.out.println("Enter "+(i+1)+"th Element: ");
            array[i] = sc.nextInt();
        }
        for (int element:array){
            System.out.print(element + " ");
        }
    }
}
