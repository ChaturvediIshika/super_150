package Codeforces_Daily_Question;

import java.util.Scanner;

public class Minority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s= sc.next();
            int z=0,o=0;
            for (int i=0;i<s.length();i++){
                if(s.charAt(i)=='0')
                    z++;
                else
                    o++;
            }
            int m=0;
            if(z==o)
                m--;
            System.out.println(Math.min(z,o)+m);
        }
    }
}
