package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SatisfyingConstraints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> ls=new ArrayList<>();
            int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
            while (n-->0){
                int type= sc.nextInt();
                int x=sc.nextInt();
                if(type==1){
                    min=Math.max(min,x);
                }
                else if(type==2)
                    max=Math.min(max,x);
                else
                    ls.add(x);
            }
            int c=0;
            for(int l:ls){
                if(l>=min && l<=max)
                    c++;
            }
            if(max-min-c+1<0)
                System.out.println(0);
            else
                System.out.println(max-min-c+1);
        }
    }
}
