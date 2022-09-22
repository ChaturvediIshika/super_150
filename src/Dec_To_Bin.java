public class Dec_To_Bin {
    public static void main(String[] args) {
        int n=33;
        int b=8;//b= dest any base
        int d=2;//source base
        int sum=0,mul=1;
        while(n>0)
        {
            int r=n%b;
            sum+=r*mul;
            mul=mul*d;
            n=n/b;
        }
        System.out.println(sum);
    }
}
