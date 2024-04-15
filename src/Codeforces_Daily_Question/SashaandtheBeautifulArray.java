package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class SashaandtheBeautifulArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
            }
            int sum=0;
            Arrays.sort(a);
            for(int i=1;i<n;i++){
                sum+=(a[i]-a[i-1]);
            }
            System.out.println(sum);
        }
    }
}
