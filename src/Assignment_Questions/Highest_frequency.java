package Assignment_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class Highest_frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int r=sc.nextInt();
            map.put(r,map.getOrDefault(r,0)+1);
        }
        int max=0,p=0;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
                p=i;
            }
        }
        System.out.println(p);
    }
}
