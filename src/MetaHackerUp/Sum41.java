package MetaHackerUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int p=sc.nextInt();
            int prime[]={2,3,5,7,11,13,17,19,23,29,31,37,41};
            List<Integer> ls=new ArrayList<>();
            int sum=0;
            for(int k:prime){
                while (p%k==0){
                    ls.add(k);
                    sum+=k;
                    p/=k;
                }
            }
            if(sum<41){
                while (sum<41){
                    ls.add(1);
                    sum++;
                }
            }
            if(sum==41){
                System.out.print("Case #"+i+": "+ls.size());
                for (int n:ls)
                    System.out.print(" "+n);
                System.out.println();
            }
            else
                System.out.println("Case #"+i+": "+(-1));
        }
    }
}
