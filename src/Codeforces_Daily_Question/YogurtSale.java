package Codeforces_Daily_Question;

import java.util.Scanner;

public class YogurtSale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a= sc.nextInt();
            int b=sc.nextInt();
            int min=a*n;
            if(n%2!=0){
                min=Math.min(min,((n-1)/2)*b+a);
            }
            else
                min=Math.min(min,(n/2)*b);
            System.out.println(min);
        }
    }
}
