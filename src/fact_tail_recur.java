public class fact_tail_recur {
    public static void main(String[] args) {
        System.out.println(fact(5,1));
    }
    public static int fact(int n,int f)
    {
        if(n==0)
        {
            return f;
        }
        f=f*n;
        return fact(n-1,f);
    }
}
