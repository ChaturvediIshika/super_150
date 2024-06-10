package Codeforces_Daily_Question;

import Searching.LinearSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MrPerfectlyFine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            List<Integer> ls11=new ArrayList<>();
            List<Integer> ls01=new ArrayList<>();
            List<Integer> ls10=new ArrayList<>();
            for(int i=0;i<n;i++){
                int k= sc.nextInt();
                String s=sc.next();
                if(s.equals("11"))
                    ls11.add(k);
                else if(s.equals("01"))
                    ls01.add(k);
                else if (s.equals("10"))
                    ls10.add(k);
            }
            int min=Integer.MAX_VALUE;
            if((ls01.size()>0 && ls10.size()>0) || ls11.size()>0) {
                if(ls11.size()>0){
                    Collections.sort(ls11);
                    min=Math.min(min,ls11.get(0));
                }
                if(ls01.size()>0 && ls10.size()>0) {
                    Collections.sort(ls01);
                    Collections.sort(ls10);
                    min = Math.min(ls01.get(0) + ls10.get(0), min);
                }
            }
            else {
                System.out.println(-1);
                continue;
            }
            System.out.println(min);
        }
    }
}
