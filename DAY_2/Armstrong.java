import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int m=n;
        int s=0;
        int sum=0;
        while(n>0){
            s=n%10;
            sum+=Math.pow(s,3);
            n=n/10;
        }
        if(sum==m){
            System.out.println(m+" is a Armstrong number");
        }
        else{
            System.out.println(m+" is not a Armstrong number");
        }
        sn.close();
    }
}
