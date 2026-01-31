import java.util.*;
public class sumarray {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        int res=0;
        int mul=1;
        for(int i=0;i<n;i++){
            res+=a[i];
            mul*=a[i];
        }
        System.out.println("Sum of the subarray: "+res);
        System.out.println("Multiplication of the subarray: "+mul);
        sn.close();
    }
}
