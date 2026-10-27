package Day_10;

public class Day10_MergeLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
	    ListNode curr = dummy;
	    
	    while(list1 != null && list2 != null) {
	        if(list1.val <= list2.val) {
	            curr.next = list1;
	            list1 = list1.next;
	        } else {
	            curr.next = list2;
	            list2 = list2.next;
	        }
	        curr = curr.next;
	    } 
	    
	    if(list1 == null) {
	        curr.next = list2;
	    } else {
	        curr.next = list1;
	    }
	    
	    return dummy.next;
	}

	public static void printList(ListNode head) {
	    ListNode temp = head;
	    while (temp != null) {
	        System.out.print(temp.val + " -> ");
	        temp = temp.next;
	    }
	    System.out.println("null");
	}

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		
		Day10_MergeLists solution = new Day10_MergeLists();
		ListNode mergedList = solution.mergeTwoLists(list1, list2);
		
		System.out.print("Đoàn tàu sau khi gộp: ");
		printList(mergedList);
				
	}

}
