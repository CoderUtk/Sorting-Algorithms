package classes.sorting;

import algorithms.sorting.GenericFunctions;
import algorithms.sorting.MergeSort;
import java.util.Date;

public class MergeSortImpl extends GenericFunctions implements MergeSort {

    @Override
    public int[] sortUsingMergeSort(int[] numbers) {
        start_time = new Date();
        int left = 0;
        int right = numbers.length - 1;
        mergeSort(numbers, left, right);
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    private int[] mergeSort(int[] numbers, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            numbers = mergeSort(numbers, left, middle);
            numbers = mergeSort(numbers, middle + 1, right);
            numbers = merge(numbers, left, middle, right);
        }
        return numbers;
    }

    private int[] merge(int numbers[], int left, int middle, int right) {
        int left_array_length = left - middle + 1;
        int right_array_length = right - middle;
        int[] left_array = new int[left_array_length];
        int[] right_array = new int[right_array_length];
        //temp arrays
        System.arraycopy(numbers, 0, left_array, 0, left_array_length);
        System.arraycopy(numbers, 0, right_array, 0, right_array_length);
        //Merge
        int left_counter = 0, right_counter = 0;
        int arr_counter = left;
        for (; left_counter < left_array_length && right_counter < right_array_length; arr_counter++) {
            if (left_array[left_counter] < right_array[right_counter]) {
                numbers[arr_counter] = left_array[left_counter];
                left_counter++;
            } else {
                numbers[arr_counter] = right_array[right_counter];
                right_counter++;
            }
        }
        for (; left_counter < left_array_length; left_counter++, arr_counter++) {
            numbers[arr_counter] = left_array[left_array_length];
        }
        for (; right_counter < right_array_length; right_counter++, arr_counter++) {
            numbers[arr_counter] = right_array[right_array_length];
        }
        return numbers;
    }

    @Override
    public double[] sortUsingMergeSort(double[] numbers) {
        start_time = new Date();
        int left = 0;
        int right = numbers.length - 1;
        mergeSort(numbers, left, right);
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    private double[] mergeSort(double[] numbers, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            numbers = mergeSort(numbers, left, middle);
            numbers = mergeSort(numbers, middle + 1, right);
            numbers = merge(numbers, left, middle, right);
        }
        return numbers;

    }

    private double[] merge(double numbers[], int left, int middle, int right) {
        int left_array_length = left - middle + 1;
        int right_array_length = right - middle;
        int[] left_array = new int[left_array_length];
        int[] right_array = new int[right_array_length];
        //temp arrays
        System.arraycopy(numbers, 0, left_array, 0, left_array_length);
        System.arraycopy(numbers, 0, right_array, 0, right_array_length);
        //Merge
        int left_counter = 0, right_counter = 0;
        int arr_counter = left;
        for (; left_counter < left_array_length && right_counter < right_array_length; arr_counter++) {
            if (left_array[left_counter] < right_array[right_counter]) {
                numbers[arr_counter] = left_array[left_counter];
                left_counter++;
            } else {
                numbers[arr_counter] = right_array[right_counter];
                right_counter++;
            }
        }
        for (; left_counter < left_array_length; left_counter++, arr_counter++) {
            numbers[arr_counter] = left_array[left_array_length];
        }
        for (; right_counter < right_array_length; right_counter++, arr_counter++) {
            numbers[arr_counter] = right_array[right_array_length];
        }
        return numbers;
    }

    @Override
    public long[] sortUsingMergeSort(long[] numbers) {
        start_time = new Date();
        int left = 0;
        int right = numbers.length - 1;
        mergeSort(numbers, left, right);
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    private long[] mergeSort(long[] numbers, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            numbers = mergeSort(numbers, left, middle);
            numbers = mergeSort(numbers, middle + 1, right);
            numbers = merge(numbers, left, middle, right);
        }
        return numbers;

    }

    private long[] merge(long numbers[], int left, int middle, int right) {
        int left_array_length = left - middle + 1;
        int right_array_length = right - middle;
        int[] left_array = new int[left_array_length];
        int[] right_array = new int[right_array_length];
        //temp arrays
        System.arraycopy(numbers, 0, left_array, 0, left_array_length);
        System.arraycopy(numbers, 0, right_array, 0, right_array_length);
        //Merge
        int left_counter = 0, right_counter = 0;
        int arr_counter = left;
        for (; left_counter < left_array_length && right_counter < right_array_length; arr_counter++) {
            if (left_array[left_counter] < right_array[right_counter]) {
                numbers[arr_counter] = left_array[left_counter];
                left_counter++;
            } else {
                numbers[arr_counter] = right_array[right_counter];
                right_counter++;
            }
        }
        for (; left_counter < left_array_length; left_counter++, arr_counter++) {
            numbers[arr_counter] = left_array[left_array_length];
        }
        for (; right_counter < right_array_length; right_counter++, arr_counter++) {
            numbers[arr_counter] = right_array[right_array_length];
        }
        return numbers;
    }

    @Override
    public char[] sortUsingMergeSort(char[] characters, Boolean isCaseSensitive) {
        start_time = new Date();
        int left = 0;
        int right = characters.length - 1;
        mergeSort(characters, left, right, isCaseSensitive);
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return characters;
    }

    private char[] mergeSort(char[] characters, int left, int right, Boolean isCaseSensitive) {
        if (left < right) {
            int middle = (left + right) / 2;
            characters = mergeSort(characters, left, middle, isCaseSensitive);
            characters = mergeSort(characters, middle + 1, right, isCaseSensitive);
            characters = merge(characters, left, middle, right, isCaseSensitive);
        }
        return characters;

    }

    private char[] merge(char characters[], int left, int middle, int right, Boolean isCaseSensitive) {
        int left_array_length = left - middle + 1;
        int right_array_length = right - middle;
        char[] left_array = new char[left_array_length];
        char[] right_array = new char[right_array_length];
        //temp arrays
        System.arraycopy(characters, 0, left_array, 0, left_array_length);
        System.arraycopy(characters, 0, right_array, 0, right_array_length);
        //Merge
        int left_counter = 0, right_counter = 0;
        int arr_counter = left;
        for (; left_counter < left_array_length && right_counter < right_array_length; arr_counter++) {
            char temp1 = left_array[left_counter];
            char temp2 = right_array[right_counter];
            if (!isCaseSensitive) {
                temp1 = (char) (temp1 < 97 ? temp1 + 32 : temp1);
                temp2 = (char) (temp2 < 97 ? temp2 + 32 : temp2);
            }
            if (temp1 < temp2) {
                characters[arr_counter] = left_array[left_counter];
                left_counter++;
            } else {
                characters[arr_counter] = right_array[right_counter];
                right_counter++;
            }
        }
        for (; left_counter < left_array_length; left_counter++, arr_counter++) {
            characters[arr_counter] = left_array[left_array_length];
        }
        for (; right_counter < right_array_length; right_counter++, arr_counter++) {
            characters[arr_counter] = right_array[right_array_length];
        }
        return characters;
    }
}
