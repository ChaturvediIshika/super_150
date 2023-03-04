package Assignment_Questions;

import java.util.*;
import java.util.Scanner;

public class Arrays_Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
//        int a[]=new int [n];
//        int b[]=new int[n];
        HashMap<Integer,Integer> mapa=new HashMap<>();
        HashMap<Integer,Integer> mapb=new HashMap<>();
        for(int i=0;i<n;i++) {
            int q = sc.nextInt();
            mapa.put(q, mapa.getOrDefault(q,0)+1);
        }
        for(int i=0;i<n;i++) {
            int q = sc.nextInt();
            mapb.put(q, mapb.getOrDefault(q, 0) + 1);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i:mapa.keySet()){
            if(mapb.containsKey(i)){
                int v=Math.min(mapa.get(i),mapb.get(i));
                for(int j=0;j<v;j++)
                    ls.add(i);
            }
        }
        Collections.sort(ls);
        System.out.println(ls);
    }
}
