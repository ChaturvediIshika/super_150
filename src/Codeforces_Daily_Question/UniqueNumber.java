package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            if(n>45)
                System.out.println(-1);
            else {
                int k=9;
                List<Integer> ls=new ArrayList<>();
                while (n>0){
                    if(n>=k){
                        ls.add(k);
                        n-=k;
                    }
                    k--;
                }
                Collections.sort(ls);
                int s=0;
                for (int i:ls)
                    s=s*10+i;
                System.out.println(s);
            }
        }
    }
}
