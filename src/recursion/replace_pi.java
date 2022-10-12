package recursion;

public class replace_pi {
    public static void main(String[] args) {
        String str="xipipix";
        convert(str,"");
    }
    public static void convert(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        if(ques.length()>1 && ques.charAt(0)=='p' && ques.charAt(1)=='i')
        {
            convert(ques.substring(2),ans+"3.14");
        }
        else {
            convert(ques.substring(1),ans+ques.charAt(0));
        }
    }
}
