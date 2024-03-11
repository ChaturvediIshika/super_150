package Codeforces_Daily_Question;

import java.util.Scanner;

public class FrogJumping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            long a= sc.nextLong();
            long b=sc.nextLong();
            long k=sc.nextLong();
            long sum=0;
            sum=(a-b)*(k/2);
            if(k%2!=0)
                sum+=a;
            System.out.println(sum);
        }
    }
}
