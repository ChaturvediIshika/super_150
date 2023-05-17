package DP_Assignment;

import java.util.Scanner;

public class Number_of_Steps_to_reach_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        steps(n,0);
        System.out.println(s);
    }
    static int s=Integer.MAX_VALUE;
    public static void steps(int n,int m){
        if(n==1){
            s=Math.min(s,m);
            return;
        }
        if(n<1)
            return;
        if(n%2==0){
            steps(n/2,m+1);
        }
        else {
            steps(n-1,m+1);
            steps(n+1,m+1);
        }
    }
}
