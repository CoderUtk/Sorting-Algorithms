package main.classes;

import main.interfaces.BubbleSortImpl;

public class BubbleSort implements BubbleSortImpl {

    /**
     * Returns a sorted array of integers using Bubble Sort
     *
     * @author Utkarsh
     * @version 1.0
     */
    @Override
    public int[] sortUsingBubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    /**
     * Returns a sorted array of Double datatype using Bubble Sort
     *
     * @author Utkarsh
     * @version 1.0
     */
    @Override
    public double[] sortUsingBubbleSort(double[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    double temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    /**
     * Returns a sorted array of long datatype using Bubble Sort
     *
     * @author Utkarsh
     * @version * 1.0
     */
    @Override
    public long[] sortUsingBubbleSort(long[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    long temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    /**
     * Returns a sorted array of characters using Bubble Sort
     *
     * @author Utkarsh
     * @version 1.0
     */
    @Override
    public char[] sortUsingBubbleSort(char[] characters) {
        for (int i = 0; i < characters.length - 1; i++) {
            for (int j = 0; j < characters.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    long temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        } //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Returns a sorted array of Strings using Bubble Sort
     *
     * @author Utkarsh
     * @version 1.0
     */
    @Override
    public String[] sortUsingBubbleSort(String[] characters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Number[] sortNumberUsingBubbleSort(Number[] numbers, String type) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if ((int) numbers[j] > (int) numbers[j + 1]) {
                    int temp = (int) numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

    private Object[] convertPrimitiveToWrapperClass(Object[] obj) {

        return obj;
    }
}
