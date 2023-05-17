package Assignment_4440;

import java.util.Arrays;
import java.util.Scanner;

public class Chocolate_on_Sale {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            int i=0,j=n-1;
            int sum=0;
            while(i<=j){
                sum+=a[i];
                for(int r=0;r<k;r++)
                    j--;
                i++;
            }
            System.out.println(sum);
        }
    }
}
