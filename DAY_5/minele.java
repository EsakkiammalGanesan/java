import java.util.*;
public class minele {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The minimum or smallest element present in a array is : "+min);
        sn.close();
    }
}
