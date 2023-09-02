package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        char ch[][]=new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                ch[i][j]=sc.next().charAt(0);
        }
        System.out.println(color(ch,m,n));
    }
    public static String color(char ch[][],int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ch[i][j]=='C' ||ch[i][j]=='M'|| ch[i][j]=='Y')
                    return "#Color";
            }
        }
        return "#Black&White";
    }
}
