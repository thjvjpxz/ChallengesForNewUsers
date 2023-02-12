
import ListNode.ListNode;

public class ID_876 {
    public static void main(String[] args) {
        ListNode head = null;
        head = init(head);
        ListNode coppy = head;

        int count = 0;
        while (coppy != null) {
            count++;
            coppy = coppy.next;
        }

        int mid = count / 2;
        int index = 0;
        while (head != null) {
            if (index == mid)   break;
            head = head.next;
            index++;
        }
    }

    public static ListNode init(ListNode head) {
        ListNode a1 = new ListNode(5, null);
        ListNode a2 = new ListNode(4, a1);
        ListNode a3 = new ListNode(3, a2);
        ListNode a4 = new ListNode(2, a3);
        head = new ListNode(1, a4);
        
        return head;
    }

    public static void displayListNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    
}