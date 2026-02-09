import java.util.*;
public class reversestr {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        int n=s.length();
        char a[]=s.toCharArray();
        int start=0;
        int end=n-1;
       while(start<end){
        char temp=a[start];
        a[start]=a[end];
        a[end]=temp;
        start++;
        end--;
       }
       System.out.println(new String(a));
    }
    
}
