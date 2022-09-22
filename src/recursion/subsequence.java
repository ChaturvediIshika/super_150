package recursion;

public class subsequence {
    public static void main(String[] args) {
        String str="abc";
        seq(str,"");
    }
    public static void seq(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        seq(ques.substring(1),ans);
        seq(ques.substring(1),ans+ch);
    }
}
