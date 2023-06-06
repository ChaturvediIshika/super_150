package Codeforces_Daily_Question;

import java.util.Scanner;

public class Distance_and_Axis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a=sc.nextInt();
            if(n<=a){
                System.out.println(a-n);
            }
            else if((n%2==0 && a%2==0) || (n%2!=0 && a%2!=0))
                System.out.println(0);
            else System.out.println(1);
        }
    }
}
