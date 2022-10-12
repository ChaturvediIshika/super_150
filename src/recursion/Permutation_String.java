package recursion;

public class Permutation_String {
    public static void main(String[] args) {
        String str="ABCD";
        permutation(str,"");
    }
    public static void permutation(String ques,String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for (int i=0;i<ques.length();i++)
        {
            char ch=ques.charAt(i);
            permutation(ques.substring(0,i)+ques.substring(i+1),ans+ch);
        }
    }
}
