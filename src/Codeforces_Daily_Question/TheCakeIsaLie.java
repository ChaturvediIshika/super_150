package Codeforces_Daily_Question;

import java.util.Scanner;

public class TheCakeIsaLie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int m= sc.nextInt();
            int n=sc.nextInt();
            int k= sc.nextInt();
            if((m-1+m*(n-1))==k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
