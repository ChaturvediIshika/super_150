package Assignment_4440;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Pairs_On_Line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int c=sc.nextInt();
        int a[]=new int[n];
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            map.put(a[i],new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            map.get(a[i]).add(i);
        }
//        System.out.println(map);
        int z=0;
        for(int i=0;i<n;i++){
            int y=m*a[i]+c;
            if(map.containsKey(y)){
                if(y==a[i])
                    z+=map.get(y).size()-1;
                else
                    z+=map.get(y).size();
            }
//            System.out.println(z+" sbdlsnd");
        }
        System.out.println(z);
    }
}
