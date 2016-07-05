package piaordu;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class P2AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        
        if(l1 == null) {
        	l3 = l2;
        } else if(l2 == null) {
        	l3 = l1;
        } else if(l1 != null && l2 != null){
        	int sum = l1.val + l2.val;
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;
            l3 = new ListNode(sum % 10);
            ListNode node = l3;
            sum = sum / 10;
            while(next1 != null || next2 != null || sum != 0) {
            	sum += ((next1!=null)?next1.val:0) + ((next2!=null)?next2.val:0);
            	node.next = new ListNode(sum % 10);
            	node = node.next;
            	next1 = (next1!=null)?next1.next:null;
            	next2 = (next2!=null)?next2.next:null;
            	sum = sum / 10;
            }
        }
        
        return l3;
    }
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		P2AddTwoNumbers test = new P2AddTwoNumbers();
		ListNode result = test.addTwoNumbers(l1, l2);
		System.out.println(result.val +" " + result.next.val + " " + result.next.next.val);
	}
}
