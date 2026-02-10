import java.util.*;
public class indexposition {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        char key=sn.next().charAt(0);
        char a[]=s.toCharArray();
        int count=0;
         System.out.println("The "+key+" value is found at a index of ");
        for(int i=0;i<s.length();i++){
            if(a[i]==key){
                System.out.print(i+" ");
                count++;
            }
        }
        if(count==0){
        System.out.println("No such key element present in the string");
        }
        sn.close();
    }
}
