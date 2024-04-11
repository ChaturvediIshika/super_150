package Cryptography;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveRoot {
    public static void main(String[] args) {
        List<Integer> ls=prim_root_can(31);
        int p=phi(31);
        pri_root(p,ls,31);
    }
    public static List<Integer> prim_root_can(int n){
        List<Integer> ls=new ArrayList<>();
        List<Integer> pr=new ArrayList<>();
        pr.add(1);
        outer:
        for(int i=2;i<n;i++){
            if(n%i==0)
                ls.add(i);
            else{
                for(int j:ls){
                    if(((i % j) == 0) || ((j % i) == 0)){
                        ls.add(i);
                        continue outer;
                    }
                }
                pr.add(i);
            }
        }
        return pr;
    }
    public static int phi(int n){
        int res=1;
        for(int i=2;i<n;i++){
            if(gcd(n,i)==1)
                res++;
        }
        return res;
    }
    public static int gcd(int a,int b){
        if(a%b==0)
            return b;
        if(a==b)
            return a;
        return gcd(b,a%b);
    }
    public static void pri_root(int phi_n,List<Integer> ls,int n){
        List<Integer> pr=new ArrayList<>();
        outer:
        for(int i:ls) {
                int r=i,k=phi_n;
                while (k-->2){
                    r=(r*i)%n;
                    if(r==1) {
                        continue outer;
                    }
                }
            pr.add(i);
        }
        System.out.println(pr);
    }
}
