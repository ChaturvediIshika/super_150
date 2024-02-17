package Codeforces_Daily_Question;

import java.util.Scanner;

public class BeatTheOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int e=0,o=0;
            for(int i=0;i<n;i++){
                a[i]= sc.nextInt();
                if(a[i]%2==0)
                    e++;
                else
                    o++;
            }
            System.out.println(Math.min(e,o));
        }
    }
}
