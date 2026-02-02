import java.util.*;
public class nxtprime {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int k=n+1;
        while(true){
        int count=0;
        for(int i=1;i<=k;i++){
            if(k%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("The next prime after "+n+" is "+k);
            break;
        }
        k++;
        }
        sn.close();
    }
}
