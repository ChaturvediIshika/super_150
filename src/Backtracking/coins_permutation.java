package Backtracking;

public class coins_permutation {
    public static void main(String[] args) {
        int a[]={2,3,5};
        int sum=10;
        permutation(a,sum,"",0);
    }
    public static void permutation(int a[],int sum,String ans,int sum1)
    {
        if(sum1==sum)
        {
            System.out.println(ans);
            return;
        }
        else if(sum1>sum)
        {
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            permutation(a,sum,ans+a[i],sum1+a[i]);
        }
    }
}
