/*
For explanation of QuickSort: https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm

Time Complexity : O(n log(n))
Space Complexity : O (log(n))

*/


import java.util.Scanner;
public class QuickSort {
    static int[] A;
    private static int partition( int p, int r){
        int pivot = A[r];
        int i=p-1;
        for(int j=p;j<r;j++)
            if(A[j]<=pivot){
                i++;
                int temp=A[j];
                A[j]=A[i];
                A[i]=temp;
        }
        A[r]=A[i+1];
        A[i+1]=pivot;
        return i+1;

    }

    private static void quick(int p,int r){
        int q;
        if(p<r)
        {
          q=partition(p,r);
            quick(p,q-1);
            quick(q+1,r);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n=scan.nextInt();
        A=new int[n];
        System.out.println("Enter the array");
        for(int i=0;i<n;i++)
            A[i]=scan.nextInt();
        quick(0,n-1);
        System.out.println("Sorted array is:  ");
        for(int i=0;i<n;i++)
            System.out.print(A[i]+" ");

    }
}
