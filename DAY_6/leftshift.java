import java.util.*;
public class leftshift {
    static void reversal(int a[], int start,int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        int d=sn.nextInt();
        d=d%n;
        reversal(a,0,d-1);
        reversal(a,d,n-1);
        reversal(a,0,n-1);
        for(int nums:a){
            System.out.print(nums+" ");
        }
    }
}
