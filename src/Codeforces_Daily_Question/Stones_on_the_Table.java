package Codeforces_Daily_Question;

import java.util.Scanner;

public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int c=0;
        for (int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1))
                c++;
        }
        System.out.println(c);
    }
}
