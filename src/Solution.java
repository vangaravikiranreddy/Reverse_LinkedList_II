public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        while (left-- > 1) {
            dummy = dummy.next;
        }
        ListNode curNode = dummy.next;

        ListNode nextNode = head;

        while (right-- >= 0) {
            nextNode = nextNode.next;
        }
        ListNode finalLast = nextNode;

        while (curNode != finalLast) {
            ListNode remNodes = curNode.next;
            curNode.next = nextNode;
            nextNode = curNode;
            curNode = remNodes;
        }
        dummy.next = nextNode;

        return head.next;
    }
}
