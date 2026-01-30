import java.util.*;
public class Conditionalstatement {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int n=sn.nextInt();
        if(n%2==0){
            System.out.println(n+" is a even number");
        }
        else{
            System.out.println(n+" is a odd number");
        }
        sn.close();
    }
}
