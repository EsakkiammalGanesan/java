import java.util.*;
public class lcm {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int a=sn.nextInt();
        int b=sn.nextInt();
        int x=Math.max(a,b);
        int y=a*b;
        int ans=0;
        for(int i=x;i<=y;i++){
            if(i%a==0 && i%b==0){
                ans=i;
                break;
            }
        }
        System.out.println("The LCM of "+a+" and "+b+" is : "+ans);
        sn.close();
    }
    
}
