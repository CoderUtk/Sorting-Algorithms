package sortingAlgorithms;


import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int a[]=new int[1000];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
       
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
               //swap
               a[i]=a[i]+a[i+1];
               a[i+1]=a[i]-a[i+1];
               a[i]=a[i]-a[i+1];
               
               for(int j=i;j>0;j--)
                   if(a[j]<a[j-1]){
                     //swap
                       a[j]=a[j]+a[j-1];
                       a[j-1]=a[j]-a[j-1];
                       a[j]=a[j]-a[j-1];
                   }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");        
    }
}
