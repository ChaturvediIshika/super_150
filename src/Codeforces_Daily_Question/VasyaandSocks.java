package Codeforces_Daily_Question;

import java.util.Scanner;

public class VasyaandSocks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println(n+(n-1)/(m-1));
    }
}
