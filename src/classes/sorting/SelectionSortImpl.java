package classes.sorting;

import algorithms.sorting.GenericFunctions;
import algorithms.sorting.SelectionSort;
import java.util.Date;

public class SelectionSortImpl extends GenericFunctions implements SelectionSort {

    @Override
    public int[] sortUsingSelectionSort(int[] numbers) {
        start_time = new Date();
        for (int i = 0; i < numbers.length - 1; i++) {
            int min_value_key = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_value_key]) {
                    min_value_key = j;
                }
            }
            numbers = swap(numbers, i, min_value_key);
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    @Override
    public double[] sortUsingSelectionSort(double[] numbers) {
        start_time = new Date();
        for (int i = 0; i < numbers.length - 1; i++) {
            int min_value_key = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_value_key]) {
                    min_value_key = j;
                }
            }
            numbers = swap(numbers, i, min_value_key);
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    @Override
    public long[] sortUsingSelectionSort(long[] numbers) {
        start_time = new Date();
        for (int i = 0; i < numbers.length - 1; i++) {
            int min_value_key = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_value_key]) {
                    min_value_key = j;
                }
            }
            numbers = swap(numbers, i, min_value_key);
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    @Override
    public char[] sortUsingSelectionSort(char[] characters, Boolean isCaseSensitive) {
        start_time = new Date();
        for (int i = 0; i < characters.length - 1; i++) {
            int min_value_key = i;
            for (int j = i + 1; j < characters.length; j++) {
                char temp1 = characters[j];
                char temp2 = characters[min_value_key];
                if (!isCaseSensitive) {
                    temp1 = (char) (temp1 < 97 ? temp1 + 32 : temp1);
                    temp2 = (char) (temp2 < 97 ? temp2 + 32 : temp2);
                }
                if (temp1 < temp2) {
                    min_value_key = j;
                }
            }
            characters = swap(characters, i, min_value_key);
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return characters;
    }

}
