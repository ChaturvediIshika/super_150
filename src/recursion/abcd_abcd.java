package recursion;

public class abcd_abcd {
    public static void main(String[] args) {
        String str="abcd";
        abcd(str,"");
    }
    public static void abcd(String ques,String ans)
    {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        if(ch=='c')
        {
            ch='r';
        }
        abcd(ques.substring(1),ans+ch);
    }
}
