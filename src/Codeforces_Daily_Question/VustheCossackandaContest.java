package Codeforces_Daily_Question;

import java.util.Scanner;

public class VustheCossackandaContest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int k= sc.nextInt();
        if(n<=m && n<=k)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
