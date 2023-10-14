package Codeforces_Daily_Question;

import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2==0){
            for(int i=1;i<=n;i+=2) {
                System.out.print(i+1 + " ");
                System.out.print(i+" ");
            }
        }
        else{
            System.out.println(-1);
        }
    }
}
