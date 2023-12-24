package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class SashaandArrayColoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++)
                a[i]= sc.nextInt();
            Arrays.sort(a);
            int sum=0;
            int i=0,j=n-1;
            while (i<=j){
                sum+=a[j]-a[i];
                i++;
                j--;
            }
            System.out.println(sum);
        }
    }
}
