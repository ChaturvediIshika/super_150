package Codeforces_Daily_Question;

import java.util.HashMap;
import java.util.Scanner;

public class AllDistinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n= sc.nextInt();
            int m=n;
            HashMap<Integer,Integer> map=new HashMap<>();
            while (n-->0){
                int k= sc.nextInt();
                map.put(k,map.getOrDefault(k,0)+1);
            }
            int sum=0;
            for(int key: map.keySet()){
                sum+=map.get(key) -1;
            }
            System.out.println(map.size()-sum%2);
        }
    }
}
