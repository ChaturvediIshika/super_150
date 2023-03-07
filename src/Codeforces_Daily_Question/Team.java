package Codeforces_Daily_Question;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0,cnt=0;
        for(int i=0;i<n;i++){
            cnt=0;
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if(a==1)
                cnt++;
            if (b==1)
                cnt++;
            if (c==1)
                cnt++;
            if(cnt>=2)
                ans++;

        }
        System.out.println(ans);
    }
}
