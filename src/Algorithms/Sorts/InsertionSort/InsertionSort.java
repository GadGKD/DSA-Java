package Algorithms.Sorts.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    // starts from the second element in an index and compares against the precedent index element
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = i;
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }


        }
    }

    public static void main(String[] args) {

        int[] myArray = {2, 1, 8, 6, 5, 4};

        insertionSort(myArray);

        System.out.println(Arrays.toString(myArray));

    }
}
