package Pattern;

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int k=1;
            for (int j=0;j<=i;j++)
            {
                System.out.print(k+" ");
                k=(k*(i-j))/(j+1);
            }
            System.out.println();
        }
    }
}
