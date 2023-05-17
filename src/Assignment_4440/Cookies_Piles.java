package Assignment_4440;

import java.util.Scanner;

public class Cookies_Piles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a=sc.nextInt();
            int d= sc.nextInt();
            double s=(n*1.0)/2*(2*a+(n-1)*d);
            System.out.println((int)(s));
        }
    }
}
