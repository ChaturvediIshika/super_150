package leetcode;

import java.util.Arrays;

public class Combination_sum_II {
    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(arr);
        Combination(arr,target,"",0);
    }
    public static void Combination(int a[],int t, String ans,int idx)
    {
        if(t==0)
        {
            System.out.println(ans);
            return;
        }
        for (int i=idx;i<a.length;i++)
        {
            if (i!=idx && a[i]==a[i-1])
                continue;
            if(t>=a[i])
            {
                Combination(a,t-a[i],ans+a[i]+" ",i+1);
            }
        }
    }
}
