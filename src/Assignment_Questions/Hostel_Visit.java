package Assignment_Questions;

import java.util.*;

public class Hostel_Visit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Integer> ls=new ArrayList<>();
        while (n-->0){
            int q=sc.nextInt();
            if(q==1){
                int x=sc.nextInt();
                int y=sc.nextInt();
                int dist=(int)(Math.pow(x,2)+Math.pow(y,2));
                ls.add(dist);
                Collections.sort(ls);
            }
            else if (q==2){
                System.out.println(ls.get(k-1));
            }
        }
    }
}
