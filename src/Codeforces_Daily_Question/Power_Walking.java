package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class Power_Walking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            HashSet<Integer> hs=new HashSet<>();
            for(int i=0;i<n;i++)
                hs.add(sc.nextInt());
            for(int i=1;i<=hs.size();i++){
                System.out.print(hs.size()+" ");
            }
            for (int i=hs.size()+1;i<=n;i++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
