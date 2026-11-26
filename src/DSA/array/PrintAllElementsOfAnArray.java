package DSA.array;

/*
Create an integer array: 12, 25, 8, 36, 19, 45, 7.
Use a for loop to print every element.
Print the total number of elements using .length.
*/

public class PrintAllElementsOfAnArray {
    public void printAllElementsOfAnArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\nLength: " + array.length);
    }
    public static void main(String[] args) {
        int[] array = {12, 25, 8, 36, 19, 45, 7};
        PrintAllElementsOfAnArray printArray = new PrintAllElementsOfAnArray();
        printArray.printAllElementsOfAnArray(array);
    }
}

