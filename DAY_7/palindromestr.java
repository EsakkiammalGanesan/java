import java.util.*;
public class palindromestr {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        char a[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<s.length();i++){
            if(a[i]!=a[n-i-1]){
                System.out.println("It is not a palindrome");
                return;
            }
        }
        System.out.println("It is a Palindrome");
    }
    
}
