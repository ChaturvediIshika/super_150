package Pattern;

import java.util.Scanner;
/*
                       1
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
 */
public class Pattern_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n= sc.nextInt();
        int n=5;
        int k1=0;
        for(int i=1;i<=n;i++)
        {
            int k=i-1;
            for(int j=i;j<n;j++)
                System.out.print("\t");
            for (int j=1;j<i*2;j++) {
                if (j <=i)
                    System.out.print(++k+"\t");
                else {
                    System.out.print(--k + "\t");
                }
            }
            System.out.println();
        }
    }
}
