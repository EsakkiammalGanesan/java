import java.util.*;
public class lastdigit {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        System.out.println("Last digit of a "+n+" is "+Math.abs(n%10));
        sn.close();
    }
}
