package Divide_Conquer;

public class Power {
    public static void main(String[] args) {
        int a=2;
        int b=5;
        System.out.println(pow(a,b));
    }
    public static int pow(int a,int b)
    {
        if(b==0)
            return 1;
        int ans=pow(a,b/2);
        if(b%2==0)
        {
            return ans*ans;
        }
        else
            return ans*ans*a;
    }
}
