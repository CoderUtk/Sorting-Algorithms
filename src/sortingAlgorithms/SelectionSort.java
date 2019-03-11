package sortingAlgorithms;

import java.util.Scanner;
public class SelectionSort {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt(),min,index=0;
        int a[]=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Sorted Array is:");
        for(int i=0;i<n;i++){
            min=a[i];
            for(int j=i;j<n;j++){
                if(a[j]<=min){
                    min=a[j];
                    index=j;
                }
            }
            System.out.print(min+" ");
            a[i]=a[i]+a[index];
            a[index]=a[i]-a[index];
            a[i]=a[i]-a[index];
            }
       
    }
}
