package classes.sorting;

import algorithms.sorting.GenericFunctions;
import algorithms.sorting.QuickSort;
import java.util.Date;

public class QuickSortImpl extends GenericFunctions implements QuickSort {

    private boolean isCaseSensitive;

    @Override
    public int[] sortUsingQuickSort(int[] numbers) {
        start_time = new Date();
        quicksort(numbers, 0, numbers.length - 1);
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    private int[] quicksort(int[] numbers, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(numbers, low, high);
            numbers = quicksort(numbers, low, pivot - 1);
            numbers = quicksort(numbers, pivot - 1, high);
        }
        return numbers;
    }

    private int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = --low;
        for (int j = low; j < high; j++) {
            if (numbers[j] <= pivot) {
                i++;
                numbers = swap(numbers, i, j);
            }
            numbers = swap(numbers, i, high);
        }
        return (i + 1);
    }

    @Override
    public double[] sortUsingQuickSort(double[] numbers) {
        start_time = new Date();
        quicksort(numbers, 0, numbers.length - 1);
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    private double[] quicksort(double[] numbers, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(numbers, low, high);
            numbers = quicksort(numbers, low, pivot - 1);
            numbers = quicksort(numbers, pivot - 1, high);
        }
        return numbers;
    }

    private int partition(double[] numbers, int low, int high) {
        double pivot = numbers[high];
        int i = --low;
        for (int j = low; j < high; j++) {
            if (numbers[j] <= pivot) {
                i++;
                numbers = swap(numbers, i, j);
            }
            numbers = swap(numbers, i, high);
        }
        return (i + 1);
    }

    @Override
    public long[] sortUsingQuickSort(long[] numbers) {
        start_time = new Date();
        quicksort(numbers, 0, numbers.length - 1);
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    private long[] quicksort(long[] numbers, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(numbers, low, high);
            numbers = quicksort(numbers, low, pivot - 1);
            numbers = quicksort(numbers, pivot - 1, high);
        }
        return numbers;
    }

    private int partition(long[] numbers, int low, int high) {
        long pivot = numbers[high];
        int i = --low;
        for (int j = low; j < high; j++) {
            if (numbers[j] <= pivot) {
                i++;
                numbers = swap(numbers, i, j);
            }
            numbers = swap(numbers, i, high);
        }
        return (i + 1);
    }

    @Override
    public char[] sortUsingQuickSort(char[] characters, Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
        start_time = new Date();
        quicksort(characters, 0, characters.length - 1);
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return characters;

    }

    private char[] quicksort(char[] characters, int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(characters, low, high);
            characters = quicksort(characters, low, pivot - 1);
            characters = quicksort(characters, pivot - 1, high);
        }
        return characters;
    }

    private int partition(char[] characters, int low, int high) {
        char pivot = characters[high];
        int i = --low;

        for (int j = low; j < high; j++) {
            char temp1 = characters[j];
            char temp2 = pivot;
            if (!isCaseSensitive) {
                temp1 = (char) (temp1 < 97 ? temp1 + 32 : temp1);
                temp2 = (char) (temp2 < 97 ? temp2 + 32 : temp2);
            }
            if (temp1 <= temp2) {
                i++;
                characters = swap(characters, i, j);
            }
            characters = swap(characters, i, high);
        }
        return (i + 1);
    }
}
