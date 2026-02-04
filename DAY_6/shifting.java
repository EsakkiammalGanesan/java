import java.util.*;
public class shifting {
    static void reversal(int a[],int start,int end){
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
        int s=sn.nextInt();
        s=s%n;
        reversal(a,n-s,n-1);
        reversal(a,0,n-s-1);
        reversal(a,0,n-1);
        for(int nums:a){
            System.out.print(nums+" ");
        }
        sn.close();
    }
}
