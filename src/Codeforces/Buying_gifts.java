package Codeforces;

import java.util.*;

public class Buying_gifts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            List<Integer> ls1=new ArrayList<>();
            List<Integer> ls2=new ArrayList<>();
            for(int i=0;i<n;i++){
                ls1.add(sc.nextInt());
                ls2.add(sc.nextInt());
            }
            Collections.sort(ls1);
            Collections.sort(ls2);
            int a[]=new int[n+1];
            a[n-1]=ls2.get(n-1);
            for(int i=n-2;i>=0;i--)
                a[i]=Math.max(ls2.get(i),a[i+1]);
            HashSet<Integer> hs=new HashSet<>();
            System.out.println(ls1);
            System.out.println(ls2);
            int min=Integer.MAX_VALUE;
            for(int i=0;i<ls2.size();i++){
                int max=a[i+1];
                if(i!=n-1)
                    min=Math.min(min,Math.abs(max-ls1.get(i)));
                if(max<ls1.get(i) && !hs.isEmpty()){

                }
                int q=ls2.get(i);
                int r= Collections.binarySearch(ls1,q);
                if(r>0){
                    min=0;
                    break;
                }
                else {
                    int j=(r*(-1))-1;
                    if(j<ls1.size()) {
                        min = Math.min(min, Math.abs(ls1.get(j - 1) - q));
                        min = Math.min(min, Math.abs(ls1.get(j) - q));
                    }
                    else{
                        min = Math.min(min, Math.abs(ls1.get(j - 1) - q));
                    }
                }
            }
            System.out.println(min);
        }
    }
}
