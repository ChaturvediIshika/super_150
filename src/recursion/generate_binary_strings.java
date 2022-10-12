package recursion;

public class generate_binary_strings {
    public static void main(String[] args) {
        String str="1??0?101";
        convert(str,"");
    }
    public static void convert(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        if(ch=='?')
        {
            convert(str.substring(1),ans+'0');
            convert(str.substring(1),ans+'1');
        }
        else {
            convert(str.substring(1),ans+ch);
        }
    }
}
