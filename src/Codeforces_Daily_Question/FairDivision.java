package Codeforces_Daily_Question;

import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a=0,e=0,o=0;
            for(int i=0;i<n;i++) {
                a= sc.nextInt();
                if(a==1)
                    e++;
                else o++;
            }
            if((e%2==0 && e!=0)||(o%2==0 && e==0) )
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
