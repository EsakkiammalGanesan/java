import java.util.*;
public class triangularptn {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        System.out.println("The triangular pattern of "+n+" is:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sn.close();
    }
}
