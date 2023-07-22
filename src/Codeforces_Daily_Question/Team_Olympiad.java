package Codeforces_Daily_Question;

import java.util.*;

public class Team_Olympiad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        map.put(1,new ArrayList<>());
        map.put(2,new ArrayList<>());
        map.put(3,new ArrayList<>());
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int k= sc.nextInt();
            map.get(k).add(i);
        }
        min=Math.min(min,map.get(1).size());
        min=Math.min(min,map.get(2).size());
        min=Math.min(min,map.get(3).size());
        System.out.println(min);
        while (min-->0){
            for (int key:map.keySet()){
                System.out.print(1+map.get(key).get(map.get(key).size()-1)+" ");
                map.get(key).remove(map.get(key).size()-1);
            }
            System.out.println();
        }
    }
}
