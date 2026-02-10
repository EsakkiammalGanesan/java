import java.util.*;
public class addingchar {
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine();
        int n=s.length();
        char a[]=s.toCharArray();
        char b[]=new char[50];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==' '){
                b[j++]='%';
                b[j++]='2';
                b[j++]='0';
            }
            else{
                b[j++]=a[i];
            }
        }
        System.out.println(new String(b,0,j));
    }
    
}
