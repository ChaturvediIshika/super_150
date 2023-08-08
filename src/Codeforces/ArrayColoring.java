package Codeforces;

import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int e=0,o=0;
            for (int i=0;i<n;i++){
                a[i]= sc.nextInt();
                if(a[i]%2==0)
                    e++;
                else
                    o++;
            }
            if(e%2==0 && o%2==0)
                System.out.println("YES");
            else if(e%2!=0 && o%2==0)
                System.out.println("YES");

            else
                System.out.println("NO");
        }
    }
}
