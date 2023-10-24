package Codeforces_Daily_Question;

import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long a= sc.nextLong();
            long b=sc.nextLong();
            if(2*a<=b){
                System.out.println(a*(x+y));
            }
            else {
                System.out.println(b*Math.min(x,y)+a*Math.abs(x-y));
            }
        }
    }
}
