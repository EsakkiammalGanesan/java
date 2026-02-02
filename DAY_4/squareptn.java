import java.util.*;
public class squareptn {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        System.out.println("The Square pattern of "+n+"*"+n+" is:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sn.close();
    }
}
