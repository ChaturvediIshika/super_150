package Codeforces_Daily_Question;

import java.util.Scanner;

public class DIV_MOD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long l=sc.nextLong();
            long r=sc.nextLong();
            long a= sc.nextLong();
            long sum=r/a+r%a;
            long m=(r/a*a)-1;
            if(m>=l){
                sum=Math.max(sum,(m/a)+(m%a));
            }
            System.out.println(sum);
        }
    }
}
