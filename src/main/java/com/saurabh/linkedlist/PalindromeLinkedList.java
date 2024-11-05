package com.saurabh.linkedlist;

public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head) {
        if ( head == null ) return true;
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = ReverseLinkedList.reverse(slow);
        Node curr = head;
        while (rev != null) {
            if (rev.data != curr.data) {
                return false;
            }
            rev = rev.next;
            curr = curr.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(10);
        if (isPalindrome(head)) {
            System.out.println("Is Palindrome!");
        }
    }
}
