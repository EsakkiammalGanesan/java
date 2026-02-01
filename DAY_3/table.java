import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" x "+n+" = "+(i*n));
        }
        sn.close();
    }
}
