import java.util.*;
public class fsdigit {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        while(n>=10){
            n=n/10;
        }
        System.out.println("First digit of a given number is. "+n);
        sn.close();
    }
}
