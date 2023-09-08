public class ListNodeService {
    private ListNode head;
    private ListNode tail;

    public void addNode(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
           head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public ListNode getHead() {
        return head;
    }
}
