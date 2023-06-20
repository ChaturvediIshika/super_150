package Codeforces_Daily_Question;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);
        int sum2=0,c=0;
        for(int i=n-1;i>=0;i--){
            if(sum2>sum)
                break;
            sum-=a[i];
            sum2+=a[i];
            c++;
        }
        System.out.println(c);
    }
}
