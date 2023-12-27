package Codeforces_Daily_Question;

import java.util.Scanner;

public class WherestheBishop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while (t-->0){
            int row=0,col=0;
            char ch[][]=new char[8][8];
            for(int i=0;i<8;i++){
                String s= sc.next();
//                System.out.println(s.length());
                for(int j=0;j<8;j++)
                    ch[i][j]=s.charAt(j);
            }
            for(int i=1;i<7;i++){
                for(int j=1;j<7;j++){
                    if(ch[i][j]=='#' && ch[i+1][j-1]=='#' && ch[i+1][j+1]=='#' && ch[i-1][j-1]=='#' && ch[i-1][j+1]=='#'){
                        row=i+1;
                        col=j+1;
                    }
                }
            }
            System.out.println(row+" "+col);
        }
    }
}
