import java.util.*;
public class ascendescen {
    public static void main(String[] sri){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        Arrays.sort(a);
        int k=n/2;
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=n-1;i>=k;i--){
            System.out.print(a[i]+" ");
        }
    }
}
