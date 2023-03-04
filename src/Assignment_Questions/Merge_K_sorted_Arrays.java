package Assignment_Questions;

import java.util.*;

public class Merge_K_sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n*q;i++){
            int r=sc.nextInt();
            ls.add(r);
        }

        Collections.sort(ls);
        for (int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
        }
    }
}
