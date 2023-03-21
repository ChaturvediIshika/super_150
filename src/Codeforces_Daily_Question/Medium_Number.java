package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Medium_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[3];
            a[0]=sc.nextInt();
            a[1]=sc.nextInt();
            a[2]=sc.nextInt();
            Arrays.sort(a);
            System.out.println(a[1]);
        }
    }
}
