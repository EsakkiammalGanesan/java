import java.util.*;
public class swapvowel{
    static boolean isvowel(char a){
        return(a=='a'||a=='e'||a=='i'||a=='o'||a=='u');
    }
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        String s=sn.nextLine().toLowerCase();
        int n=s.length();
        char a[]=s.toCharArray();
        int start=0;
        int end=n-1;
        while(start<end){
            if(!isvowel(a[start])){
                start++;
                continue;
            }
            if(!isvowel(a[end])){
                end--;
                continue;
            }
char temp=a[start];
a[start]=a[end];
a[end]=temp;
start++;
end--;
        }
        System.out.println(new String(a));
        sn.close();
    }
}