package Graph;

//There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you.
//        You receive a list of non-empty words from the dictionary,
//        where words are sorted lexicographically by the rules of this new language. Derive the order of letters in this language.


import java.util.*;

public class Alien_Dictionary {
    HashMap<Character, List<Character>> map=new HashMap<>();
    public String fillMap(String str[]) {
        for (String s : str) {
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i)))
                    map.put(s.charAt(i), new ArrayList<>());
            }
        }
        for (int i=0;i< str.length-1;i++){
            String s1=str[i];
            String s2=str[i+1];
            if(s1.startsWith(s2) && s1.length()>s2.length())
                return "";
            for (int j=0;j<Math.min(s1.length(),s2.length());j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    map.get(s1.charAt(j)).add(s2.charAt(j));
                    break;
                }
            }
        }
        return Topological();
    }
    public int[] degreeIn(){
        int in[]=new int[26];
        for(char key:map.keySet()){
            for (char nbrs:map.get(key)){
                in[nbrs-'a']++;
            }
        }
        return in;
    }
    public String Topological(){
        int in[]=degreeIn();
        StringBuilder sb=new StringBuilder();
        Queue<Character> q=new LinkedList<>();
        for (char ch:map.keySet()){
            if(in[ch-'a']==0)
                q.add(ch);
        }
        int c=0;
        while(!q.isEmpty()){
            char rv=q.remove();
            c++;
            sb.append(rv);
            for (char nbrs:map.get(rv)){
                in[nbrs-'a']--;
                if(in[nbrs-'a']==0)
                    q.add(nbrs);
            }
        }
        if(c== map.size())
            return sb.toString();
        return "";
    }
    public static void main(String[] args) {
        String str[]={"wrt","wrf","er","ett","rftt"};
        Alien_Dictionary ad=new Alien_Dictionary();
        System.out.println(ad.fillMap(str));

    }
}
