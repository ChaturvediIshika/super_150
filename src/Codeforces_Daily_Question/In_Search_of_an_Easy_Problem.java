package Codeforces_Daily_Question;

import java.util.Scanner;

public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int o=0,z=0;
        for (int i=0;i<n;i++){
            int q= sc.nextInt();
            if(q==0)
                z++;
            else o++;
        }
        if(o>=1)
            System.out.println("HARD");
        else
            System.out.println("EASY");
    }
}
