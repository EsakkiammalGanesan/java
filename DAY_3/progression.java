import java.util.Scanner;

public class progression {
     public static void main(String[] args) {
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter a value for n: ");
    int n=sn.nextInt();
    System.out.println("Enter a value for a: ");
    int a=sn.nextInt();
    System.out.println("Enter a value for d: ");
    int d=sn.nextInt();
    System.out.println("Enter a value for r: ");
    int r=sn.nextInt();
    int t =a+(n-1)*d;
    int g=a*(int)(Math.pow(r,n-1));
    System.out.println("Arithmetic Progression: "+t);
    System.out.println("Geomentric Progression: "+g);
    sn.close();
    }
    
}
