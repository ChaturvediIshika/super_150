package recursion;

public class String_to_Integer {
    public static void main(String[] args) {
        String str="1234";
        convert(str,0);
    }
    public static void convert(String str,int n)
    {
        if(str.length()==0)
        {
            System.out.println(n);
            return;
        }
        char ch=str.charAt(0);
        int r=ch-'0';
        convert(str.substring(1),n*10+r);
    }
}
