package Codeforces_Daily_Question;

import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n=sc.nextLong(),k=0,x;
            for(int i=1;i<=9;i++){
                x=i;
                while(x<=n){
                    k++;
                    x=(x*10)+i;
                }
            }
            System.out.println(k);
        }
    }
}
