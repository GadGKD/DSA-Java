package Algorithms.Sorts.SelectionSort;

import java.util.Arrays;

public class SelectionSort {


    // checks for the min value at a particular index then sort
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }

    }

    public static void main(String[] args) {

        int[] myArray = {6,4,6,8,9,2,4};

        selectionSort(myArray);

        System.out.println(Arrays.toString(myArray));

    }
}
