package test;

import swordOffer.ListNode;

/**
 * ²âÊÔÁ´±íµÄÐÞ¸Ä
 * 
 * @author Stephen Huge
 *
 */

public class ListNodeTest {
	public static void main(String[] args) {
		ListNode a = new ListNode(1, 
				new ListNode(2, 
						new ListNode(3, 
								new ListNode(4))));		
		ListNode b = null;
		ListNode c = null;
		b = a.next;
//		b.next = null;
		a.next = c;
		
	}
}
