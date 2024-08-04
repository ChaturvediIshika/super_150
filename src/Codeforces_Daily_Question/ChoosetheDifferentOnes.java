package Codeforces_Daily_Question;

import java.util.HashSet;
import java.util.Scanner;

public class ChoosetheDifferentOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            HashSet<Integer> hn=new HashSet<>();
            HashSet<Integer> hm=new HashSet<>();
            HashSet<Integer> hk=new HashSet<>();
            for(int i=0;i<n;i++){
                int r=sc.nextInt();
                if(r<=k){
                    hn.add(r);
                    hk.add(r);
                }
            }
            for(int i=0;i<m;i++){
                int r=sc.nextInt();
                if(r<=k){
                    hm.add(r);
                    hk.add(r);
                }
            }
            if(hk.size()<k)
                System.out.println("NO");
            else if(hn.size()<(k/2) || hm.size()<(k/2))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
