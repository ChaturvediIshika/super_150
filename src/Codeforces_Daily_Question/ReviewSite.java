package Codeforces_Daily_Question;

import java.util.Scanner;

public class ReviewSite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                int k=sc.nextInt();
                if(k==1 || k==3)
                    c++;
            }
            System.out.println(c);
        }
    }
}
