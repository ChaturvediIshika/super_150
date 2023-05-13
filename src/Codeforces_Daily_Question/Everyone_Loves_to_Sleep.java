package Codeforces_Daily_Question;

import java.util.Scanner;

public class Everyone_Loves_to_Sleep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            int m=sc.nextInt();
            int i,min=1000000,tot=h*60+m;
            for(i=0;i<n;i++)
            {
                int x=sc.nextInt();
                int y=sc.nextInt();
                int t2=x*60+y;
                int diff=t2-tot;
                if(diff<0)
                    diff+=1440;
                min=Math.min(diff,min);
            }
            int ans1=min/60;
            int ans2=min-ans1*60;
            System.out.println(ans1+" "+ans2);
        }
    }
}
