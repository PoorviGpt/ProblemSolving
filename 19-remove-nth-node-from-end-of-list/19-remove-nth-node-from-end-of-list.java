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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=1;
        Map<Integer,Integer> hMap=new LinkedHashMap<>();
        while(temp != null)
        {
            hMap.put(len,temp.val);
            len++;
            temp=temp.next;
        }
        int ind=(len)-n;
        hMap.remove(ind);
        
        ListNode head1 = new ListNode();
        ListNode temp1 = head1;
        Iterator<Map.Entry<Integer,Integer>> itr = hMap.entrySet().iterator();
         
        while(itr.hasNext())
        {
            Map.Entry<Integer,Integer> entry = itr.next();
            temp1.next=new ListNode(entry.getValue());
             temp1 =temp1.next;
        }
        return head1.next;
    }
}