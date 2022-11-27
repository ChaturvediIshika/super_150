package leetcode;
//Sieve Of Eratosthenes
public class Prime_Number {
    public static void main(String[] args) {
        int n=100;
        boolean a[]=new boolean[n+1];
        prime(n,a);
        print(a);
    }
    public static void prime(int n,boolean a[])
    {
        for(int i=2;i*i<a.length;i++)
        {
            if(a[i]==false)
            {
                for (int j=2;i*j<=n;j++)
                {
                    a[i*j]=true;
                }
            }
        }
    }
    public static void print(boolean a[])
    {
        for(int i=2;i<a.length;i++)
        {
            if(!a[i])
            {
                System.out.println(i);
            }
        }
    }
}
