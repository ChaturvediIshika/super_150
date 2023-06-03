package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Social_Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long m=sc.nextLong();
            long a[]=new long[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextLong();
            }
            if(n>m)
                System.out.println("NO");
            else {
                Arrays.sort(a);
                long sum = 2 * a[n - 1];

                for (int i = 1; i < n - 1; i++)
                    sum += a[i];
                sum += n;
                if (sum > m)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}
