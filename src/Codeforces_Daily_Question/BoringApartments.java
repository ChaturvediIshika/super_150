package Codeforces_Daily_Question;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int sum=10*((n%10)-1);
            int c=1;
            while(n>0){
                n=n/10;
                sum+=c;
                c++;
            }
            System.out.println(sum);
        }
    }
}
