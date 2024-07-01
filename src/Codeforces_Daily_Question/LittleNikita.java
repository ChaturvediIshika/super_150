package Codeforces_Daily_Question;

import java.util.Scanner;

public class LittleNikita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int m=sc.nextInt();
            if(n<m)
                System.out.println("NO");
            else {
                n=n-m;
                if(n%2==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
