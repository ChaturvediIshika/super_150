package Codeforces_Daily_Question;

import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b= sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int max=Math.max(a,Math.max(b,c));
            int q=0;
            q+=(max-a)+(max-b)+(max-c);
//            System.out.println(q);
            if(q<=n && (n-q)%3==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
