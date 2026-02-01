import java.util.*;
public class MoveZero {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                a[j++]=a[i];
            }
        }
        while(j<n){
            a[j++]=0;
        }
        for(int num:a){
            System.out.print(num+" ");
        }
        sn.close();
    }
}
