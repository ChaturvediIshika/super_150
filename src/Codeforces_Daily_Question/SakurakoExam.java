package Codeforces_Daily_Question;

import java.util.Scanner;

public class SakurakoExam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            b=b%2;
            if (b==1 && a<2) {
                System.out.println("NO");
                continue;
            }
            if(b==1)
                a-=2;
            if(a%2==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
