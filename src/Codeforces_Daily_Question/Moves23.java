package Codeforces_Daily_Question;

import java.util.Scanner;

public class Moves23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n==1) {
                System.out.println(2);
                continue;
            }
            int sum=n/3;
            if(n%3==1 || n%3==2)
                sum++;
            System.out.println(sum);
        }
    }
}
