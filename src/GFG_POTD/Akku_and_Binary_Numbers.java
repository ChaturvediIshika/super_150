package GFG_POTD;

import Inheritance.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Akku_and_Binary_Numbers {
    public static void main(String[] args) {
        long L=11,R=19;
        precompute();
        System.out.println(solve(L,R));
    }
    static ArrayList<Long> a=new ArrayList<>();
    public static void precompute(){
        for(int i=0;i<63;i++){
            for(int j=i+1;j<63;j++){
                for(int k=j+1;k<63;k++) {
                    a.add((long)(Math.pow(2,i))+(long)(Math.pow(2,j))+(long)(Math.pow(2,k)));
                }
            }
        }
        Collections.sort(a);
    }
    public static long solve(long L,long R){
        int index1 = Collections.binarySearch(a, L);
        index1 =  index1<0 ? -index1-1 : index1;

        // BS for R
        int index2 = Collections.binarySearch(a, R);
        index2 =  index2<0 ? -index2-2 : index2;

        //
        return index2-index1+1;
    }
}
