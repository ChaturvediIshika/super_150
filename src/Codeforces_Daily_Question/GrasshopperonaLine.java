package Codeforces_Daily_Question;

import java.util.Scanner;

public class GrasshopperonaLine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            if(n%k!=0)
                System.out.println("1\n"+n);
            else{
                int r=n%k;
                System.out.println(2);
                System.out.println((n-1)+" "+1);
            }
        }
    }
}
