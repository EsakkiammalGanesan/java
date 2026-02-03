import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sn.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
        }
        for(int nums:a){
            System.out.print(nums+" ");
        }
        sn.close();
    }
}
//Time Complexity:O(n^2); Space Complexity:O(1);