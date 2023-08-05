package Codeforces_Daily_Question;

import java.util.Scanner;

public class Black_Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for (int i=0;i<4;i++)
            a[i]= sc.nextInt();
        String n=sc.next();
        int sum=0;
        for(int i=0;i<n.length();i++){
            int k=n.charAt(i)-'1';
            sum+=a[k];
        }
        System.out.println(sum);
    }
}
