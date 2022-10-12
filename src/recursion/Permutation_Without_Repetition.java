package recursion;

public class Permutation_Without_Repetition {
    public static void main(String[] args) {
        String str="abca";
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
            boolean flag=true;
            for (int j=i+1;j<ques.length();j++)
            {
                if(ch==ques.charAt(j))
                {
                    flag=false;
                    break;
                }
            }
            if(flag) permutation(ques.substring(0, i) + ques.substring(i + 1), ans + ch);
        }
    }
}
