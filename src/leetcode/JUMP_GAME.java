package leetcode;

public class JUMP_GAME {
    public static void main(String[] args) {
        int a[]={1,1,2,5,2,1,0,0,1,3};
        System.out.println(jump(a));
    }
    public static boolean jump(int a[]){
        int r=0,q=0;
        for(int i=0;i<a.length;i++){
            if(r<i)
                return false;
            r=Math.max(r,i+a[i]);
        }
        return true;
    }
}
