import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int a=sn.nextInt();
        int b=sn.nextInt();
        int x=Math.min(a,b);
        int ans=0;
        for(int i=1;i<=x;i++){
            if(a%i==0 && b%i==0){
                ans=i;
            }
        }
        System.out.println("The GCD of "+a+" and "+b+" is : "+ans);
        sn.close();
    }
}
