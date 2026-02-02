import java.util.*;
public class divisor {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ,");
                count++;
            }
        }
        System.out.println();
        System.out.println("The given number "+n+" contains "+count+" divisors.");
        sn.close();
    }
}
