import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==0) continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=0;
                }
            }
            System.out.print(a[i]+"-->"+count+" ,");
        }
        sn.close();
    }
}
