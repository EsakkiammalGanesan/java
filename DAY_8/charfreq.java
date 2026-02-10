import java.util.*;
public class charfreq {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine().toLowerCase();
        int n=s.length();
        char a=sn.next().charAt(0);
        int freq=0;
        for(int i=0;i<n;i++){
            char b=s.charAt(i);
            if(a==b){
                freq++;
            }
        }
        System.out.println("The character "+a+" is occuring in "+freq+" times");
        sn.close();
    }
}
