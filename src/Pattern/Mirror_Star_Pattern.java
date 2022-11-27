package Pattern;

import java.util.Scanner;
/*
        *
     *  *  *
  *  *  *  *  *
     *  *  *
        *
 */
public class Mirror_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n= sc.nextInt();
        int n=5;
        int k=1,sp=n/2+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<sp;j++)
                System.out.print("\t");
            for (int j=1;j<=k;j++)
                System.out.print("*\t");
            if(i<n/2+1) {
                k += 2;
                sp--;
            }
            else {
                k -= 2;
                sp++;
            }
            System.out.println();
        }
    }
}
