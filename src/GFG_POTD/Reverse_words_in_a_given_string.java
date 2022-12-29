package GFG_POTD;

public class Reverse_words_in_a_given_string {
    public static void main(String[] args) {
        String str="i.like.this.program.very.much";
        System.out.println(revers(str));
    }
    public static String revers(String str){
        String sq="";
        String[] s=str.split("\\.");
        for(int i=s.length-1;i>=0;i--)
            sq+=s[i]+".";
        return sq.substring(0,sq.length()-1);
    }
}
