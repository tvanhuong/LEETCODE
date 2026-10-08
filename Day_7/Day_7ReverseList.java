package Day_7;
//Dao nguoc danh sach
public class Day_7ReverseList {
	public ListNode reversiList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null)
        {
        	ListNode temp = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = temp;
        }return prev;
	}
	public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.println("Tàu ban đầu:");
        printList(head);
        
        Day_7ReverseList solution = new Day_7ReverseList();
        ListNode newHead = solution.reversiList(head);
        
        System.out.println("Tàu sau khi đảo ngược:");
        printList(newHead);
        

	}

}
