package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            HashSet<Integer> hs=new HashSet<>();
            for (int i=0;i<n;i++)
                hs.add(sc.nextInt());
            System.out.println(hs.size());
        }
    }
}
