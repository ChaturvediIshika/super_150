package Codeforces;

import java.util.Scanner;

public class The_Very_Beautiful_Blanket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        while (z-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();

            int a[][]=new int[m][n];
            int q=10,r=1;
            System.out.println(m*n);
            int i=m;
            while(i-->0){
                int t=r;
                for (int j=0;j<10;j++)
                    t*=2;
                for(int j=0;j<n;j++)
                    System.out.print(j+1+t+" ");
                r++;
                System.out.println();
            }
//            if(m%2==0 && n%2==0) {
//                int q=1,r=3;
//                for (int i = 0; i < m; i++) {
//                    for (int j = 0; j < n; j++) {
//                        if (i % 2 == 0) {
//                            a[i][j] = q++;
//                            if (j % 2 != 0)
//                                q += 2;
//                        } else {
//                            a[i][j] = r++;
//                            if (j % 2 != 0)
//                                r += 2;
//                        }
//                    }
//                    if (i != 0 && i % 2 == 0) {
//                        q = r + 1;
//                        r = q + 3;
//                    }
//                }
//            }
////            else{
////                int q=1,r=11;
////                for (int i = 0; i < m; i++) {
////                    for (int j = 0; j < n; j++) {
////                        if (i % 2 == 0) {
////                            a[i][j] = q;
////                            q+=9;
////                            if (j % 2 != 0)
////                                q += 9;
////                        } else {
////                            a[i][j] = r;
////                            r+=9;
////                            if (j % 2 != 0)
////                                r += 9;
////                        }
////                    }
////                    if (i != 0 && i % 2 == 0) {
////                        q = r + 1;
////                        r = q + 3;
////                    }
////                }
//            }
//            for(int i=0;i<m;i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(a[i][j]+" ");
//                }
//                System.out.println();
//            }
        }
    }
}
