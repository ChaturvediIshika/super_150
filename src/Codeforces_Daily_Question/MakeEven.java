package Codeforces_Daily_Question;

import java.util.Scanner;

public class MakeEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            if(n%2==0)
                System.out.println(0);
            else{
                int c=0;
                while(n>9){
                    int rv=n%10;
                    if(rv%2==0){
                        c++;
                    }
                    n=n/10;
                }
                if(n%2==0)
                    System.out.println(1);
                else if(c>0)
                    System.out.println(2);
                else
                    System.out.println(-1);
            }
        }
    }
}
