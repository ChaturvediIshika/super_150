package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            HashSet<Integer> hs=new HashSet<>();
            boolean flag=false;
            for (int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(hs.contains(a[i]))
                    flag=true;
                hs.add(a[i]);
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
