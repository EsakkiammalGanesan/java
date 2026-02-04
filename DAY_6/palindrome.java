import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int m=n;
        int reverse=0;
        while(n>0){
            reverse=reverse*10+(n%10);
            n=n/10;
        }
        if(m==reverse){
            System.out.println(m+" is a Palindrome");
        }
        else{
            System.out.println(m+ " is not a palindrome");
        }
        //System.out.println(reverse);
        sn.close();
    }
    
}
