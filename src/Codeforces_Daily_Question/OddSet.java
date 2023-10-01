package Codeforces_Daily_Question;

import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int o=0,e=0;
            for(int i=0;i<2*n;i++){
                int k= sc.nextInt();
                if(k%2==0)
                    e++;
                else o++;
            }
            if(e==o)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
