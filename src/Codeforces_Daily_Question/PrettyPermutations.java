package Codeforces_Daily_Question;

import java.util.Scanner;

public class PrettyPermutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n%2==0){
                int i=1;
                while (i<=n){
                    System.out.print(i+1+" "+i+" ");
                    i+=2;
                }
            }
            else{
                if(n==1)
                    System.out.println(1);
                else {
                    System.out.print("3 1 2 ");
                    int i=4;
                    while (i<=n){
                        System.out.print((i+1)+" "+i+" ");
                        i+=2;
                    }
                }
            }
            System.out.println();
        }
    }
}