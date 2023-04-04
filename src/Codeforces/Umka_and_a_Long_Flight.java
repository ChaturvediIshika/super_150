package Codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Umka_and_a_Long_Flight {
    static ArrayList<Integer> ls=new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ls.add(1);
        ls.add(1);
        func();
//        for (int i = 0; i < n; i++) {
//            if (str.charAt(i) - '0' < d && c > 0) {
//                System.out.print(d);
//                c--;
//            }
//            System.out.print(str.charAt(i) - '0');
//        }
        while (t-->0){
            int n= sc.nextInt();
            int x=sc.nextInt();
            int y= sc.nextInt();
            if(fun2(x,y,n)==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static void func(){
        for(int i=0;i<46;i++)
            ls.add(ls.get(i)+ls.get(i+1));
    }
    public static int fun2(int x,int y,int n){
        if(n==1)
            return 1;
        if(Math.min(y,ls.get(n+1)-y+1)>ls.get(n+1)-ls.get(n))
            return 0;
        y=Math.min(y,ls.get(n+1)-y+1);
        return  fun2(y,x,n-1);
    }
}
