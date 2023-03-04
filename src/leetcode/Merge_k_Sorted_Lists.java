package leetcode;

import java.util.List;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists);
    }
    public ListNode merge(ListNode[] ls){
        PriorityQueue<ListNode> pq=new PriorityQueue<>((l1,l2)->l1.val-l2.val);
        for(ListNode h:ls){
            if(h!=null)
                pq.add(h);
        }
        ListNode nn=new ListNode();
        ListNode temp=nn;
        while(!pq.isEmpty()){
            ListNode nq=new ListNode();
            ListNode temp2=pq.poll();
            nq.val=temp2.val;
            temp.next=nq;
            temp=temp.next;
            if(temp2.next!=null)
                pq.add(temp2.next);
        }
        return nn.next;
    }
}
