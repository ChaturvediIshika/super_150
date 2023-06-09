package Codeforces_Daily_Question;

import java.util.Scanner;

public class Make_AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(ap(a,b,c))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static boolean ap(int a,int b,int c){
        int d=a+(c-a)/2;
        if(d/b>0 && d%b==0 && (c-a)%2==0)
            return true;
        d=b+b-a;
        if(d/c>0 && d%c==0)
            return true;
        d=b-c+b;
        if(d/a>0 && d%a==0)
            return true;
        return false;
    }
}
