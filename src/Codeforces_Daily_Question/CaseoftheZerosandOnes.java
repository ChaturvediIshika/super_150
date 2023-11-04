package Codeforces_Daily_Question;

import java.util.Scanner;

public class CaseoftheZerosandOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String str=sc.next();
        int o=0,e=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0')
                e++;
            else
                o++;
        }
        System.out.println(n-2*Math.min(o,e));
    }
}
