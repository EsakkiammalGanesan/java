import java.util.*;
public class Armstrong{
    static int isarms(int n){
        int m=n;
        int b=n;
        int len=0;
        while(n>0){
            len++;
            n=n/10;
        }
        int sum=0;
        while(m>0){
            int s=m%10;
            sum+=(int)Math.pow(s,len);
            m=m/10;
        }
        if(b==sum){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        for(int i=1;i<=n;i++){
            if(isarms(i)==1){
                System.out.print(i+" ");
            }
        }
    }
}