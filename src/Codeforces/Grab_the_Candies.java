package Codeforces;

import java.util.Scanner;

public class Grab_the_Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int e=0,o=0;
            for(int i=0;i<n;i++){
                int q=sc.nextInt();
                if(q%2==0)
                    e+=q;
                else
                    o+=q;
            }
            if(e>o)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
