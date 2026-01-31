import java.util.*;
public class firstlargest{
    static int fslarg(int a[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    static int seclar(int a[]){
         int max=a[0];
         int prev=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                prev=max;
                max=a[i];
            }
            else if(a[i]>prev && a[i]<max){
                prev=a[i];
            }
        }
        if(max!=prev){
            return prev;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        System.out.println("First Largest: "+fslarg(a));
        System.out.println("Second Largest: "+seclar(a));
        sn.close();

    }
}