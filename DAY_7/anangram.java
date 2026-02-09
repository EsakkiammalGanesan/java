import java.util.*;
public class anangram {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        String a=sn.nextLine();
        int n=a.length();
        String b=sn.nextLine() ;
        int m=b.length();
        if(n!=m){
            System.out.println("It is not a anagram..");
            return;
            
        }
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i=0;i<n;i++){
            if(c[i]!=d[i]){
                System.out.println("It is not a anagram");
                return;
            }
        }
        System.out.println("It is anagram");

    }
    
}
