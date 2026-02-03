import java.util.*;
public class linearsearch {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        System.out.println("Enter the element to search in a given array: ");
        int x=sn.nextInt();
        boolean find=false;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                System.out.println("The element "+x+" is present in a position of "+i);
                find=true;
            }
        }
        if(!find){
            System.out.println("There is no such elemnt present in a array");
        }
        sn.close();
    }
    
}
