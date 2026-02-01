import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int m=n;
        int counts=0;
        while(n>0){
            n=n/10;
            counts++;
        }
        System.out.println("The given "+m+" contains "+counts);
        sn.close();
    }
}
