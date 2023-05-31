package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Mystic_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
                b[i]=a[i];
            }
            if(n==1){
                System.out.println(-1);
                continue;
            }
            Arrays.sort(b);
            for(int i=0;i<n-1;i++){
                if(a[i]==b[i]){
                    int temp=b[i];
                    b[i]=b[i+1];
                    b[i+1]=temp;
                }
            }
            if(a[n-1]==b[n-1]){
                int temp=b[n-2];
                b[n-2]=b[n-1];
                b[n-1]=temp;
            }
            for (int i=0;i<n;i++){
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
    }
}
