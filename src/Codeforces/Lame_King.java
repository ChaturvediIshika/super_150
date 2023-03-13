package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lame_King {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int r=Math.abs(sc.nextInt());
            int c=Math.abs(sc.nextInt());
            List<Integer> ls=new ArrayList<>();
            ls.add(Integer.MAX_VALUE);
//            lame(0,0,r,c,0,ls,0);
            int s=lame(r,c);
            if(Math.abs(r-c)!=0)
                s-=1;
            System.out.println(s);
        }
    }
    public static int lame(int r,int c){
        return 2*(Math.min(r,c)+Math.abs(r-c));

    }
    public static void lame(int row, int col, int r, int c, int type, List<Integer> ls, int moves){
        if(row<(-100)||col<(-100)||row>100 || col>100){
            return;
        }
        if(row==r && col==c){
            int l=ls.get(0);
            ls.set(0,Math.min(l,moves));
            return;
        }
        if(type!=1){
            lame(row+1,col,r,c,1,ls,moves+1);
        }
        if(type!=2)
            lame(row,col+1,r,c,2,ls,moves+1);
        if(type!=3)
            lame(row-1,col,r,c,3,ls,moves+1);
        if(type!=4)
            lame(row,col-1,r,c,4,ls,moves+1);
        return;
    }
}
