package Codeforces_Daily_Question;

import java.util.Scanner;

public class LCMProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l= sc.nextInt();
            int r= sc.nextInt();
            if(2*l<=r)
                System.out.println(l+" "+(2*l));
            else
                System.out.println("-1 -1");
        }
    }
}
