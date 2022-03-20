/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<Integer,Set<ListNode>> nums=new HashMap<>();
        while(head != null)
        {
            if(!nums.containsKey(head.val))
            {
                nums.put(head.val,new HashSet<>(Arrays.asList(head.next)));
            }
            else
            {
                Set<ListNode> temps=nums.get(head.val);
                if(temps.contains(head.next))
                {
                    return head;
                }
                else
                {
                    temps.add(head.next);
                    nums.put(head.val,temps);
                }
            }
            head=head.next;
        }
        
        return head;
    }
}