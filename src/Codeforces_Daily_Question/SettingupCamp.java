package Codeforces_Daily_Question;

import java.util.Scanner;

public class SettingupCamp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            a+=b/3;
            b=b%3;
            if(b==1&&c>=2) {
                a = a + 1;
                c-=2;
            }
            else if(b==2&&c>=1) {
                a = a + 1;
                c-=1;
            }
            else if(b!=0) a=-1;
            if(a==-1){
                System.out.println(-1);
                continue;
            }
            a+=c/3;
            if(c%3>0)
                a++;
            System.out.println(a);
        }
    }
}
