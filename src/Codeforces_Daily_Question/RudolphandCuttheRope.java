package Codeforces_Daily_Question;

import java.util.Scanner;

public class RudolphandCuttheRope {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=0;
            while (n-->0){
                int x= sc.nextInt();
                int y=sc.nextInt();
                if(x>y)
                    c++;
            }
            System.out.println(c);
        }
    }
}
