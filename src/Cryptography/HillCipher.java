package Cryptography;

import java.util.Scanner;

public class HillCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1= sc.nextInt();
        int n1=sc.nextInt();
        int a[][]=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int i=0,j=0,k=0;
        int m2=sc.nextInt();
        int n2=sc.nextInt();
        int ch[][]=new int[m2][n2];
        outer:
        for(i=0;i<m2;i++){
            for(j=0;j<n2;j++)
                ch[i][j] = (sc.next().charAt(0) - '0');
        }
        int ans[][]=new int[m2][n1];
        i=0;j=0;k=0;
        while (i<m2){
            while (j<n1){
                for(k=0;k<m2;k++){
                    ans[i][j]=(ch[i][k]*a[k][j])%26;
                }
                j++;
            }
            i++;
        }
    }
}
