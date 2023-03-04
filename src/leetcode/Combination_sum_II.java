package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_sum_II {
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
        List<List<Integer>> lls=new ArrayList<>();
        Combination(arr,target,"",0,lls, new ArrayList<>());
        System.out.println(lls);
    }
    public static void Combination(int a[],int t, String ans,int idx,List<List<Integer>> lls,List<Integer> ls)
    {
        if(t==0)
        {
            System.out.println(ans);
            lls.add(new ArrayList<>(ls));
            return;
        }
        for (int i=idx;i<a.length;i++)
        {
            if (i>idx && a[i]==a[i-1])
                continue;
            if(t>=a[i])
            {
                ls.add(a[i]);
                Combination(a,t-a[i],ans+a[i]+" ",i+1,lls,ls);
                ls.remove(ls.size()-1);
            }
        }
    }
}
