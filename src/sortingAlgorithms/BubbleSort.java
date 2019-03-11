package sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

    Scanner sc = new Scanner(System.in);

    +
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Sorted Array is:\t");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

          }
       for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
