package Codeforces_Daily_Question;

import java.util.Scanner;

public class AndThenThereWereK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x = 1;
            while( x * 2 <= n){
                x = x*2;
            }
            System.out.println(x-1);
        }
    }
}
