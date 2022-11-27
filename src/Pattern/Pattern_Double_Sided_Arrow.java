package Pattern;

import java.util.Scanner;

/*
                            1
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1

 */
public class Pattern_Double_Sided_Arrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n= sc.nextInt();
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for (int j=n-i;j>0;j--)
                System.out.print("\t");
            for (int j=i;j>0;j--)
                System.out.print(j );
            for (int j = 1; j <i; j++)
                System.out.print("\t");
            if(i!=1) {
                for (int j = 1; j <= i; j++)
                    System.out.print(j );
            }
            System.out.println();
        }
    }
}
