package ua.epam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {8, 7, 4, 5, 7, 81, 2, 5, 5, 1, 0, 45, 1, 85};
        int[] arr1 = {8, 7, 4, 5, 7, 81, 2, 5, 5, 1, 0, 45, 1, 85};
        int[] arr2 = {8, 7, 4, 5, 7, 81, 2, 5, 5, 1, 0, 45, 1, 85};
        int[] arr3 = {8, 7, 4, 5, 7, 81, 2, 5, 5, 1, 0, 45, 1, 85};
        int[] arr4 = {8, 7, 4, 5, 7, 81, 2, 5, 5, 1, 0, 45, 1, 85};
        int[] arr5 = {8, 7, 4, 5, 7, 81, 2, 5, 5, 1, 0, 45, 1, 85};

        System.out.println("Input array = " + Arrays.toString(arr));

        int left = 0;          //first index of elements
        int right = 13;        //last index of elements

        Sort sort = new Sort();

        sort.bubbleSort(arr);
        System.out.println("\nBubble sort array = " + Arrays.toString(arr));

        sort.selectionSort(arr1);
        System.out.println("Selection sort array = " + Arrays.toString(arr));

        sort.insertionSort(arr2);
        System.out.println("Insertion sort array = " + Arrays.toString(arr));

        sort.quickSort(arr3, left, right);
        System.out.println("Quick sort array = " + Arrays.toString(arr));

        sort.shellaSort(arr4);
        System.out.println("Shella sort array = " + Arrays.toString(arr));

        sort.gnomeSort(arr5);
        System.out.println("Gnome sort array = " + Arrays.toString(arr));


    }
}

