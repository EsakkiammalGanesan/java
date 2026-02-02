import java.util.*;
public class fibo {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a=0;
        int b=1;
        if(n==1){
            System.out.print(a);
        }
        else if(n==2){
            System.out.print(a+" "+b);
        }
        else{
            System.out.print(a+" "+b+" ");
            for(int i=3;i<=n;i++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
        sn.close();
    }
}
