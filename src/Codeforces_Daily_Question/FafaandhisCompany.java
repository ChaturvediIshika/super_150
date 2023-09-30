package Codeforces_Daily_Question;

import java.util.Scanner;

public class FafaandhisCompany {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int c=1;
        for (int i=2;i<=n/2;i++){
            if (n%i==0)
                c++;
        }
        System.out.println(c);
    }
}
