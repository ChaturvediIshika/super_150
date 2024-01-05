package Codeforces_Daily_Question;

import java.util.Scanner;

public class PolycarpandSumsofSubsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[7];
            for(int i=0;i<7;i++)
                a[i]=sc.nextInt();
            if(a[0]+a[1]==a[2])
                System.out.println(a[0]+" "+a[1]+" "+a[3]);
            else
                System.out.println(a[0]+" "+a[1]+" "+a[2]);
        }
    }
}
