import java.util.*;
public class perfectNum {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(sum+" is a perfect number");
        }
        else{
            System.out.println(n+" is not a perfect number");
        }
        sn.close();
    }
}
