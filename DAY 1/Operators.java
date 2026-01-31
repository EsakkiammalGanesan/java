import java.util.*;
public class Operators{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int a=sn.nextInt();
        int b=sn.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Subraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulus:"+(a%b));
        sn.close();
    }
}