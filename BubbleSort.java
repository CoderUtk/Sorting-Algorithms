public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt(),min,index=0;
        int a[]=new int[1000];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Sorted Array is:\t");
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-1;j++){
                if(a[j]>a[j+1]){
                    a[j+1]=a[j+1]+a[j];
                    a[j]=a[j+1]-a[j];
                    a[j+1]=a[j+1]-a[j];
                }
            }
            
          }
       for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
