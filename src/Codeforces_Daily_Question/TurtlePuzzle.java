package Codeforces_Daily_Question;

import java.util.Scanner;

public class TurtlePuzzle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long sum=0;
            while (n-->0){
                int k=sc.nextInt();
                if(k<0)
                    k*=(-1);
                sum+=k;
            }
            System.out.println(sum);
        }
    }
}
