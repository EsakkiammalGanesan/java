import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        int a=sn.nextInt();
        System.out.print("Enter a value for b: ");
        int b=sn.nextInt();
        System.out.print("Enter a value for c: ");
        int c=sn.nextInt();
        int temp=Math.max(a,b);
        int large=Math.max(c,temp);
        System.out.println("Largest of three number  is "+large);
        sn.close();
    }
    
}
