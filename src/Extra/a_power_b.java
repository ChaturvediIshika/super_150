package Extra;

public class a_power_b {
    public static void main(String[] args) {
        System.out.println(power(2,5,1));
    }
    public static int power(int a,int b,int f)
    {
        if(b==0)
        {
            return f;
        }
        f=f*a;
        return power(a,b-1,f);
    }
}
