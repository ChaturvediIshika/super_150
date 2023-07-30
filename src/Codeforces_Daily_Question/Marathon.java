package Codeforces_Daily_Question;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a[]=new int[4];
            for(int i=0;i<4;i++)
                a[i]= sc.nextInt();
            int c=0;
            for (int i=1;i<4;i++){
                if(a[0]<a[i])
                    c++;
            }
            System.out.println(c);
        }
    }
}
