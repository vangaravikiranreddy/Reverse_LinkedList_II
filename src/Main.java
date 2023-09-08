/*

Prob => Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

 Example 1:
    Input: head = [1,2,3,4,5], left = 2, right = 4
    Output: [1,4,3,2,5]

 Example 2:
    Input: head = [5], left = 1, right = 1
    Output: [5]

*/



public class Main {
    public static void main(String[] args) {

        ListNodeService listNodeService = new ListNodeService();
        listNodeService.addNode(1);
        listNodeService.addNode(2);
        listNodeService.addNode(3);
        listNodeService.addNode(4);
        listNodeService.addNode(5);

        ListNode head = listNodeService.getHead();
        int left = 1;
        int right = 4;

        // printing the list values before it is reversed
        ListNode temp = head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.val);
                temp = temp.next;
                continue;
            }
            System.out.print(temp.val+" --> ");
            temp = temp.next;
        }

        Solution solution = new Solution();
        ListNode newHead = solution.reverseBetween(head, left, right);

        // printing the list value after it is reversed
        System.out.println("\n");

        while (newHead != null) {
            if (newHead.next == null) {
                System.out.print(newHead.val);
                newHead = newHead.next;
                continue;
            }
            System.out.print(newHead.val+" --> ");
            newHead = newHead.next;
        }
    }
}