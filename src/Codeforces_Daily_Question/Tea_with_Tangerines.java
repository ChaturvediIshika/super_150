package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Tea_with_Tangerines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            long k=2*a[0]-1;
            long r=0;
            for(int i=1;i<n;i++){
                r+=a[i]/k;
                if(a[i]%k==0)
                    r--;
            }
            System.out.println(r);
        }
    }
}
