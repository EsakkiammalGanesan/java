import java.util.*;
public class loops {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        System.out.print("For loops: ");
        for(int i=1;i<n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("While loop: ");
        int i=1;
        while(i<n){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        System.out.print("Do-While loop: ");
        int j=1;
        do{
            System.out.print(j+" ");
            j++;
        }
        while(j<n);
        sn.close();
    }
}
