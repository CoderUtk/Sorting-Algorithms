/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

import java.util.Date;

/**
 *
 * @author Utkarsh
 */
public class GenericFunctions {

    public Date start_time;
    public Date end_time;

    public double getTimeTakenInSeconds() {
        return 0;
    }

    public double[] swap(double[] arr, int a, int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public int[] swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public long[] swap(long[] arr, int a, int b) {
        long temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public char[] swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

}
