package recursion;

public class New_Permutation {
    public static void main(String[] args) {
        String str="3ab4";
        print(str,"");
    }
    public static void print(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        if(ch>='A' && ch<='Z'){
            print(str.substring(1),ans+(char)(ch+32));
            print(str.substring(1),ans+ch);
        }
        else if(ch>='a' && ch<='z'){
            print(str.substring(1),ans+ch);
            print(str.substring(1),ans+(char)(ch-32));
        }
        else
            print(str.substring(1),ans+ch);
    }
}
