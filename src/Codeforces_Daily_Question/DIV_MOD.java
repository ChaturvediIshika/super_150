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
            long sum=0;
            if(r==l){
                sum=(r/a)+(r%a);
            }
            else if(r%a==0){
                sum=(r/a)+a-2;
            }
            else{
                sum=(r/a)+(r%a);
            }
            System.out.println(sum);
        }
    }
}
