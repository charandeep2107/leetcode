/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans={-1,-1};

        int index=1;
        int first=-1;
        int last=-1;
        int min=Integer.MAX_VALUE;

        ListNode curr=head.next;
        ListNode prev=head;

        while(curr.next!=null){
            
            if((curr.val>curr.next.val && curr.val>prev.val) || (curr.val<curr.next.val && curr.val<prev.val)){

                if(first==-1)
                first=index;

                else
                min=Math.min(min,index-last);
                
                last=index;
            }
            
            
                prev=curr;
                curr=curr.next;
                index++;
        }


        if(first!=last){
        ans[0]=min;
        ans[1]=last-first;
        }

        return ans;
    }
}