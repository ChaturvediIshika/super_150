package Codeforces_Daily_Question;

import java.util.Scanner;

public class Almost_Ternary_Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] c = {{1,0,0,1},{0,1,1,0},{0,1,1,0},{1,0,0,1}};
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int m=sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(c[i%4][j%4]+" ");
                }
                System.out.println();
            }
        }
    }
}
