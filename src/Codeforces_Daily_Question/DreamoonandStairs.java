package Codeforces_Daily_Question;

import java.util.Scanner;

public class DreamoonandStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
            int m=sc.nextInt();
            int moves=t/2+t%2;
            int k=t/2;
            while(k>0){
                if(moves%m==0)
                    break;
                moves+=1;
                k-=1;
            }
            if(moves%m!=0)
                System.out.println(-1);
            else
        System.out.println(moves);
    }
}
