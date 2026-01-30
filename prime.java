import java.util.*;
public class prime {
    static int isprime(int n){
        if(n<=1) return 0;
        if(n==2) return 1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        for(int i=0;i<n;i++){
            if(isprime(a[i])==1){
                System.out.print(a[i]+" ");
            }
        }
        sn.close();
    }
}
