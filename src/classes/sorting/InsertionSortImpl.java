/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.sorting;

import algorithms.sorting.GenericFunctions;
import algorithms.sorting.InsertionSort;
import java.util.Date;

/**
 *
 * @author Utkarsh
 */
public class InsertionSortImpl extends GenericFunctions implements InsertionSort {

    @Override
    public int[] sortUsingInsertionSort(int[] numbers) {
        start_time = new Date();
        for (int i = 1; i < numbers.length; ++i) {
            int key = numbers[i];
            int index = i - 1;
            while (index > 0 && numbers[index] > key) {
                numbers[index + 1] = numbers[index];
                --index;
            }
            numbers[index + 1] = key;
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    @Override
    public double[] sortUsingInsertionSort(double[] numbers) {
        start_time = new Date();
        for (int i = 1; i < numbers.length; ++i) {
            double key = numbers[i];
            int index = i - 1;
            while (index > 0 && numbers[index] > key) {
                numbers[index + 1] = numbers[index];
                --index;
            }
            numbers[index + 1] = key;
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    @Override
    public long[] sortUsingInsertionSort(long[] numbers) {
        start_time = new Date();
        for (int i = 1; i < numbers.length; ++i) {
            long key = numbers[i];
            int index = i - 1;
            while (index > 0 && numbers[index] > key) {
                numbers[index + 1] = numbers[index];
                --index;
            }
            numbers[index + 1] = key;
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return numbers;
    }

    @Override
    public char[] sortUsingInsertionSort(char[] characters, Boolean isCaseSensitive) {
        start_time = new Date();
        char temp1;
        char temp2;
        for (int i = 1; i < characters.length; ++i) {
            temp1 = characters[i];
            char key = temp1;
            int index = i - 1;
            temp2 = characters[index];
            if (!isCaseSensitive) {
                temp1 = (char) (temp1 < 97 ? temp1 + 32 : temp1);
                temp2 = (char) (temp2 < 97 ? temp2 + 32 : temp2);
            }
            while (index > 0 && temp2 > temp1) {
                characters[index + 1] = characters[index];
                --index;
            }
            characters[index + 1] = key;
        }
        end_time = new Date();
        System.out.println(getTimeTakenInSeconds());
        return characters;
    }

}
