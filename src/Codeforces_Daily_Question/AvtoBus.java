package Codeforces_Daily_Question;

import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong();
            if(n%2!=0 || n<4){
                System.out.println(-1);
                continue;
            }
            long q=n/6;
            if(n%6==4 || n%6==2)
                q+=1;
            System.out.print(q+" ");
            q=n/4;
            System.out.print(q+" ");
            System.out.println();
        }
    }
}
