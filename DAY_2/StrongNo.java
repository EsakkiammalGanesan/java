import java.util.*;
public class StrongNo {
    static int fact(int n){
        int facts=1;
        for(int i=1;i<=n;i++){
            facts*=i;
        }
        return facts;
    }
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int m=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=fact(digit);
            n=n/10;
        }
        if(sum==m){
            System.out.println(m+" is a strong number");
        }
        else{
            System.out.println(m+" is not a strong number");
        }
        sn.close();
    }
}
