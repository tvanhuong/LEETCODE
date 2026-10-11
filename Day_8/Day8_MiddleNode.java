package Day_8;

public class Day8_MiddleNode {
	public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
	}
	public static void main(String[] args) {
		// 1. Tự tay đúc 5 toa tàu: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 2. Gọi thuật toán tìm toa giữa
        Day8_MiddleNode solution = new Day8_MiddleNode();
        ListNode middle = solution.middleNode(head);

        // 3. In kết quả ra màn hình (Sẽ in ra giá trị 3)
        if (middle != null) {
            System.out.println("Toa nằm ở giữa là toa số: " + middle.val);
        }

	}

}
