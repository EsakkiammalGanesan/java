import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        if(n%2==0){
            System.out.println(n+ " is a even number");
        }
        else{
            System.out.println(n+" is a Odd number");
        }
        sn.close();
    }
}
