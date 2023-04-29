package Codeforces_Daily_Question;

import java.util.Scanner;

public class XOR_Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            if(n%2==0){
                for(int i=0;i<n-2;i++)
                    System.out.print(4+" ");
                System.out.println(2+" "+6);
            }
            else{
                for(int i=0;i<n;i++)
                    System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
