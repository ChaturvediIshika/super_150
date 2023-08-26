package Codeforces;

import Inheritance.P;

import java.util.Scanner;

public class GiftCarpet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int m= sc.nextInt();
            char ch[][]=new char[n][m];
            for(int i=0;i<n;i++) {
                String str= sc.next();
                for (int j=0;j<m;j++)
                    ch[i][j]=str.charAt(j);
            }
            boolean v=false,i = false,k=false,a=false;
            int j=0,z=0;
            while(j<m){
                while (z<n){
                    if(ch[z][j]=='v')
                        v=true;
                    z++;
                }
                z=0;
                j++;
            }

            while(j<m){
                while (z<n){
                    if(ch[z][j]=='i')
                        i=true;
                    z++;
                }
                z=0;
                j++;
            }

            while(j<m){
                while (z<n){
                    if(ch[z][j]=='k')
                        k=true;
                    z++;
                }
                z=0;
                j++;
            }
            while(j<m){
                while (z<n){
                    if(ch[z][j]=='a')
                        a=true;
                    z++;
                }
                z=0;
                j++;
            }
            String name="vika";
            for(int b=0;b<m;b++){
                char c=name.charAt(0);
                for(int r=0;r<n;r++){
                    if(ch[r][b]==c){
                        name=name.substring(1);
                        break;
                    }
                }
                if(name.length()==0)
                    break;
            }
            if(name.length()==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
