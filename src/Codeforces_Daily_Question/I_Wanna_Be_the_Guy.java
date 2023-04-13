package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<p;i++)
            hs.add(sc.nextInt());
        p=sc.nextInt();
        for (int i=0;i<p;i++)
            hs.add(sc.nextInt());
//        System.out.println(hs);
        boolean flag=false;
        if(hs.size()==n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
