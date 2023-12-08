package Codeforces_Daily_Question;

import java.util.Scanner;

public class OddSelection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int o=0,e=0;
            int m=n;
            while (m-->0){
                int k=sc.nextInt();
                if(k%2==0)
                    e++;
                else
                    o++;
            }
            if(o == 0 || (o== n && x % 2 == 0) || (x == n && o % 2 == 0) )
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
