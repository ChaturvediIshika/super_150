package Codeforces_Daily_Question;

import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int cnt=0,sum=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();

//                sum += k;
                sum+=k;
                if(sum<0) {
                    sum=0;
                    cnt++;
                }
        }
        System.out.println(cnt);
    }
}
