package recursion;

import java.util.Scanner;

public class Dice_Path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int n = sc.nextInt();
        path(n,"",0,r);
    }

    public static void path(int n, String str, int sum,int r)
    {
        if(sum==n)
        {
            System.out.println(str);
            return;
        }
        else if(sum>n)
        {
            return;
        }
//        path(n,str+"1",sum+1);
//        path(n,str+"2",sum+2);
//        path(n,str+"3",sum+3);
        for(int i=1;i<=r;i++)
        {
            path(n,str+i,sum+i,r);
        }
    }
}
