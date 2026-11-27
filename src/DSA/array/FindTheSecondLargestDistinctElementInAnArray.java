package DSA.array;

/*
The task was to:
        1. Take array size from the user.
        2. Accept array elements using Scanner.
        3. Find the second-largest distinct element.
        4. Handle duplicates and negative numbers.
        5. Do it without sorting or nested loops.
*/
import java.util.Scanner;

public class FindTheSecondLargestDistinctElementInAnArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();
            int[] array = new int[size];
            for (int i=0; i<size; i++){
                System.out.println("Enter the element "+ (i+1));
                array[i] = sc.nextInt();
            }
            int firstLargest = array[0];
            int secondLargest = 0;
            boolean foundSecond = false;

            for (int element : array) {

                if (element > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = element;
                    foundSecond = true;

                } else if (element < firstLargest &&
                        (!foundSecond || element > secondLargest)) {

                    secondLargest = element;
                    foundSecond = true;
                }
            }

            if (foundSecond) {
                System.out.println("Second largest: " + secondLargest);
            } else {
                System.out.println("No second largest distinct element.");
            }

            sc.close();

        }
}

