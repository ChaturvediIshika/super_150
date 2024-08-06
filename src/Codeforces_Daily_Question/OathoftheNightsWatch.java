package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class OathoftheNightsWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        int c=0;
        for(int i=1;i<n-1;i++){
            if(a[i]>a[0] && a[i]<a[n-1])
                c++;
        }
        System.out.println(c);
    }
}
