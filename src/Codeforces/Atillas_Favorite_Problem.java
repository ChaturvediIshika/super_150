package Codeforces;

import java.util.Scanner;

public class Atillas_Favorite_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int x=Integer.MIN_VALUE;
            for (int i=0;i<n;i++){
                x=Math.max(x,str.charAt(i)-'a'+1);
            }
            System.out.println(x);
        }
    }
}
