import java.util.*;
public class reverseword {
    static void print(String a,int start,int end){
        System.out.print(a.substring(start,end+1)+" ");
    }
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        int n=s.length();
       // char a[]=new char[n];
        int end=n-1;
        int start=1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                start=i+1;
                print(s,start,end);
                end=i-1;
            }
            if(i==0){
                start=i;
                print(s,start,end);
            }
        }
        sn.close();
    }
    
}
