package classes.sorting;

import algorithms.sorting.BubbleSort;
import algorithms.sorting.GenericFunctions;
import java.util.Date;

public class BubbleSortImpl extends GenericFunctions implements BubbleSort {

    /**
     * Returns a sorted array of integers using Bubble Sort
     *
     * @author Utkarsh
     * @version 1.0
     * @param numbers
     * @return
     */
    @Override
    public int[] sort(int[] numbers) {
        start_time = new Date();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers = swap(numbers, j, j + 1);
                }
            }
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    /**
     * Returns a sorted array of Double datatype using Bubble Sort
     *
     * @author Utkarsh
     * @version 1.0
     * @param numbers
     * @return
     */
    @Override
    public double[] sort(double[] numbers) {
        start_time = new Date();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers = swap(numbers, j, j + 1);
                }
            }
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    /**
     * Returns a sorted array of long datatype using Bubble Sort
     *
     * @author Utkarsh
     * @version * 1.0
     */
    @Override
    public long[] sort(long[] numbers) {
        start_time = new Date();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers = swap(numbers, j, j + 1);
                }
            }
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    /**
     * Returns a sorted array of characters using Bubble Sort
     *
     * @author Utkarsh
     * @version 1.0
     * @param characters
     * @param isCaseSensitive
     */
    @Override
    public char[] sort(char[] characters, Boolean isCaseSensitive) {
        char temp1;
        char temp2;
        start_time = new Date();
        for (int i = 0; i < characters.length - 1; i++) {
            for (int j = 0; j < characters.length - i - 1; j++) {
                temp1 = characters[j];
                temp2 = characters[j + 1];
                if (!isCaseSensitive) {
                    temp1 = (char) (temp1 < 97 ? temp1 + 32 : temp1);
                    temp2 = (char) (temp2 < 97 ? temp2 + 32 : temp2);
                }
                if (temp1 > temp2) {
                    characters = swap(characters, j, j + 1);
                }
            }
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return characters;
    }
}
