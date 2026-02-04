import java.util.*;
public class nxtpermutation {
    static void swap(int a[],int start,int end){
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    static void reverse(int a[],int start,int end){
        while(start<end){
            swap(a,start++,end--);
        }
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(a[i]<a[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(a,0,n-1);
        }
        for(int i=n-1;i>pivot;i--){
            if(a[pivot]<a[i]){
                swap(a,pivot,i);
            }
        }
        reverse(a,pivot+1,n-1);
        for(int nums:a){
            System.out.print(nums+" ");
        }
        sn.close();
    }
}
