package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class RestorethePermutationbyMerger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            n=n*2;
            HashSet<Integer> hs=new HashSet<>();
            List<Integer> ls=new ArrayList<>();
            while (n-->0) {
                int k= sc.nextInt();
                if(!hs.contains(k)){
                    ls.add(k);
                    hs.add(k);
                }
            }
            for(int i:ls)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
