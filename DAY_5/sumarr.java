import java.util.*;
public class sumarr {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        int sum=0;
        int mul=1;
        for(int i=0;i<n;i++){
            sum+=a[i];
            mul*=a[i];
        }
        System.out.println("The sum of the given array is "+sum);
        System.out.println("The Product of the given array is "+mul);
        sn.close();
    }
}
