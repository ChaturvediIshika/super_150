package Codeforces_Daily_Question;

import java.util.Arrays;
import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k= sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
            }
            boolean f=true;
            Arrays.sort(b);
            for(int i=0;i<n;i++){
                if(a[i]!=b[i]){
                    f=false;
                    break;
                }
            }
            if(f)
                System.out.println("YES");
            else {
                if (n != 1 && k == 1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}
