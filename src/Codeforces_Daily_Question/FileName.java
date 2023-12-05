package Codeforces_Daily_Question;

import java.util.Scanner;

public class FileName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        while(s.contains("xxx"))
            s=s.replace("xxx","xx");
        System.out.println(n-s.length());
    }
}
