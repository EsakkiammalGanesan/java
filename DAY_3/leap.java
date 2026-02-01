import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println(n+" is a Leap Year");
        }
        else{
            System.out.println(n+" is not a Leap Year");
        }
        sn.close();
    }    
}
