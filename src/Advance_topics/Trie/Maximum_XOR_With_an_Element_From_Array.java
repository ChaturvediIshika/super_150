package Advance_topics.Trie;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Maximum_XOR_With_an_Element_From_Array {
    public static void main(String[] args) {
        int nums[]={5,2,4,6,6,3};
        int queries[][]={{12,4},{8,1},{6,3}};
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.mi-b.mi);
        int k=0;
        for (int i[]:queries){
            pq.add(new pair(i[0],i[1],k));
            k++;
        }
        Arrays.sort(nums);
        int ans[]=new int[queries.length];
        int j=0;
        Node root=new Node();
        while (!pq.isEmpty()){
            pair p=pq.poll();
            while (j<nums.length && nums[j]<=p.mi){
                Insert(root,nums[j]);
                j++;
            }
            if (j==0)
                ans[p.idx]=-1;
            else
                ans[p.idx]=getmaxXor(root,p.xi);
        }
        System.out.println(Arrays.toString(ans));
    }
    public static class pair{
        int xi,mi,idx;
        pair(int xi,int mi,int idx){
            this.xi=xi;
            this.mi=mi;
            this.idx=idx;
        }
    }
    public static class Node {
        Node zero;
        Node one;
    }

    public static void Insert(Node root, int val) {
        Node curr = root;
        for (int i = 31; i >= 0; i--) {
            if ((val & (1 << i)) == 0) {
                if (curr.zero != null) {
                    curr = curr.zero;
                } else {
                    Node nn = new Node();
                    curr.zero = nn;
                    curr = nn;
                }
            } else {
                if (curr.one != null) {
                    curr = curr.one;
                } else {
                    Node nn = new Node();
                    curr.one = nn;
                    curr = nn;
                }
            }

        }

    }

    public static int getmaxXor(Node root, int val) {
        int num = 0;
        Node curr = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (val & (1 << i));
            if (bit == 0) {
                if (curr.one != null) {
                    num += (1 << i);
                    curr = curr.one;
                } else {
                    curr = curr.zero;
                }
            } else {
                if (curr.zero != null) {
                    num += (1 << i);
                    curr = curr.zero;
                } else {
                    curr = curr.one;
                }
            }

        }
        return num;

    }
}
