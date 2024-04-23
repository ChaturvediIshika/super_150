package Codeforces_Daily_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlmostPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n+1];
        for(int i=2;i<a.length;i++){
            if(a[i]==0)
            for(int j=2;i*j<a.length;j++){
                a[i*j]=1;
            }
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(a[i]==0)
                ls.add(i);
        }
        System.out.println(ls);
        int ans=0;
        for(int i=1;i<=n;i++){
            int c=0;
            for(int j:ls){
                if(i%j==0) {
                    c++;
//                    System.out.println(i+" "+j);
                }
            }
            if(c>=2) {
                ans++;
                System.out.println(i);
            }
        }
        System.out.println(ans);
    }
}
