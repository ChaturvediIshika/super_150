package recursion;

public class fibo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
    public static int fib(int n)
    {
        if(n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
