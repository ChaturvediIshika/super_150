package Assignment_4440;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hitman_Sharma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            List<Integer> ls=new ArrayList<>();
            ls.add(a[0]);
            for(int i=1;i<n;i++){
                if(ls.get(ls.size()-1)<a[i])
                    ls.add(a[i]);
                else{
                    int k=0;
                    int l=0,h=ls.size()-1;
                    while (l<=h){
                        int mid=(l+h)/2;
                        if(ls.get(mid)>=a[i]){
                            k=mid;
                            h=mid-1;
                        }
                        else{
                            l=mid+1;
                        }
                    }
                    ls.set(k,a[i]);
                }
            }
            System.out.println(ls.size());
        }
    }
}
