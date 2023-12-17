package Codeforces_Daily_Question;

import java.util.Scanner;

public class KanaandDragonQuestgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            while(x>m*10 && n>0){
                x=x/2+10;
                n--;
            }
            if(x<=m*10)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
