package Codeforces;

import java.util.*;

public class Tea_Tasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            List<Long> ls=new ArrayList<>();
            for(int i=0;i<n;i++)
                a[i]= sc.nextInt();
            for (int i=0;i<n;i++)
                b[i]= sc.nextInt();
            for(int i=0;i<n;i++){
                long c=Math.min(a[i],b[i]);
                a[i]-=Math.min(a[i],b[i]);
                for(int j=i-1;j>=0 && a[j]!=0;j--){
                    c+=Math.min(a[j],b[i]);
                    a[j]-=Math.min(a[j],b[i]);
                }

                ls.add(c);
            }
            for(int i=0;i<ls.size();i++)
                System.out.print(ls.get(i)+" ");
            System.out.println();
        }
    }
}
