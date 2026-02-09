import java.util.*;
public class longshort {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        int n=s.length();
        int start=0;
        int maxlen=0,maxstart=0;
        int minlen=Integer.MAX_VALUE,minstart=0;
        for(int i=0;i<n;i++){
            if(i==n || s.charAt(i)==' '){
                int len=i-start;
                if(len>0){
                if(len>maxlen){
                    maxlen=len;
                    maxstart=start;
                }
                if(len<minlen){
                    minlen=len;
                    minstart=start;
                }
            }
            start=i+1;
        }
        }
        System.out.println(s.substring(minstart,minstart+minlen));
        System.out.println(s.substring(maxstart,maxstart+maxlen));
    }    
}
