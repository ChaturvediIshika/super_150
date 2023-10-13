package Codeforces_Daily_Question;

import java.util.Scanner;

public class ArraywithOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int sum=0,odd=0,even=0;
            for(int i=0;i<n;i++){
                int k= sc.nextInt();
                sum+=k;
                if(k%2!=0)
                    odd++;
                else
                    even++;
            }
            if(sum%2!=0)
                System.out.println("YES");
            else if(odd>0 &&even>0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
