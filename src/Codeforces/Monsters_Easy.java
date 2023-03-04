package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Monsters_Easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int m[]=new int[n];
            for (int i=0;i<n;i++)
                m[i]=sc.nextInt();
            long r=kill(m,n);
            int i=0;
            for(i=1;i<=n;i++) {
                long c=kill(m, i);
                if (c != r) {
                    System.out.print(c+" ");
                }
                else
                    break;
            }
            for (int j=i;j<=n;j++)
                System.out.print(r+" ");
            System.out.println();
        }
    }
    public static long kill(int arr[],int k){
        int m[]=new int[k];
        for (int i=0;i<k;i++)
            m[i]=arr[i];
        Arrays.sort(m);
        long c=0;
        if(m[0]!=1){
            c+=m[0]-1;
            m[0]=1;
        }
        for(int i=1;i<m.length;i++) {
            if (m[i] == 1)
                continue;
            else if (m[i] - m[i - 1] > 1) {
                c += m[i] - m[i - 1] - 1;
                m[i] = m[i - 1] + 1;
            }
        }
        return c;
    }
}
