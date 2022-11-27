package Pattern;

import java.util.Scanner;

public class Pattern_with_Zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                    System.out.print(i+"\t");
                else
                    System.out.print("0\t");
            }
            System.out.println();
        }
    }
}
