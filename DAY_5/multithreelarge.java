import java.util.*;
public class multithreelarge {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        if(n<3){
            System.out.println("The array must contains atleast of 3 elements");
            return;
        }
        Arrays.sort(a);
        int m=a[n-1]*a[n-2]*a[n-3];
        int k=a[0]*a[1]*a[n-1];
        System.out.println("The multiplication of three largest number is: "+Math.max(m,k));
        sn.close();

    }
    
}
