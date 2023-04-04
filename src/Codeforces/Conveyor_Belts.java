package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conveyor_Belts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int x1=sc.nextInt()-1;
            int y1=sc.nextInt()-1;
            int x2=sc.nextInt()-1;
            int y2=sc.nextInt()-1;
            System.out.println(Math.abs(calc(x1,y1,n)-calc(x2,y2,n)));
        }
    }
//    public static int distinct(String str){
//        int f1[]=new int[str.length()];
//        int f2[]=new int[str.length()];
//        Set<Character> set=new HashSet<>();
//        for (int i=0;i<str.length();i++){
//            set.add(str.charAt(i));
//            f1[i]=set.size();
//        }
//        set.clear();
//        for (int i=str.length()-1;i>=0;i--){
//            set.add(str.charAt(i));
//            f2[i]=set.size();
//        }
//        int m=0;
//        for (int i=0;i<str.length()-1;i++)
//            m=Math.max(m,f1[i]+f2[i+1]);
//        return m;
//    }
    public static int calc(int a,int b,int n){
        a=Math.min(a,n-a-1);
        b=Math.min(b,n-b-1);
        return Math.min(a,b);
    }
//    public static void distribute(int n){
//        int k=1,aw=0,ab=0,bw=0,bb=0,r=0;
//        while(n>=k){
//            if(r%2==0){
//                aw+=k/2+1;
//                ab+=k/2;
//            }
//            else{
//                bw+=k/2;
//                bb+=k/2+1;
//            }
//            n-=k;
//            k+=4;
//            r++;
//        }
//        if(r%2==0) {
//            if(n%2==0){
//                aw+=n/2;
//                ab+=n/2;
//            }
//            else {
//                aw += n / 2 + 1;
//                ab += n / 2;
//            }
//        }
//        else{
//            if(n%2==0){
//                bw+=n/2;
//                bb+=n/2;
//            }
//            else {
//                bw += n / 2;
//                bb += n / 2 + 1;
//            }
//        }
//        System.out.println(aw+" "+ab+" "+bw+" "+bb);
//    }
}
