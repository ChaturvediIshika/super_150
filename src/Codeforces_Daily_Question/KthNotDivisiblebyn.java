package Codeforces_Daily_Question;

import java.util.Scanner;

public class KthNotDivisiblebyn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            System.out.println((k-1)/(n-1)+k);
        }
    }
}
