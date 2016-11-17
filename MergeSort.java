import java.util.Scanner;
public class MergeSort {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int a[]=new int[1000];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        a=mergesort(a,0,n-1);
         System.out.println("Sorted array is:  ");
        for(int i=0;i<n;i++)
             System.out.print(a[i]+" ");
     }

     static int[] mergesort(int a[],int x,int y){
         int mid;
         if(x<y){
              mid=(x+y)/2;
             mergesort(a,x,mid);
             mergesort(a,mid+1,y);
             return merge(a,x,mid,y);
         }
             return a;
         
     }
     
     static int[] merge(int a[],int left,int mid,int right){
         
         int n1=mid-left+1;
         int n2=right-mid;
         int a1[]=new int[n1];
         int a2[]=new int[n2];
         for(int i=0;i<n1;i++)
            a1[i]=a[left+i];
         for(int i=0;i<n2;i++)
            a2[i]=a[mid+i+1];
         
         int i=0,j=0,k=left;
         
         while(i<n1 && j<n2){
             if(a1[i]<=a2[j]){
                 a[k]=a1[i];
                 i++;
             }
             else{
                 a[k]=a2[j];
                 j++;
             }
         k++;
        }
         
         while(i<n1){
            a[k]=a1[i];
            i++;k++;
         }
         
         while(j<n2){
            a[k]=a2[j];
            j++;k++;
         }
         return a;
     }
}
