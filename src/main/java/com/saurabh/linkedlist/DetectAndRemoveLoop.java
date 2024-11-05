package com.saurabh.linkedlist;

public class DetectAndRemoveLoop {
    public static Node detectAndRemoveLoop(Node head) {
        Node slow = head, fast = head;
        while ( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if ( slow == fast) {
                 break;
            }
        }
        if ( slow != fast) return head;
        slow = head;
        while ( slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(40);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp1;
        PrintingList.printList(head);
        head = detectAndRemoveLoop(head);
        PrintingList.printList(head);
    }
}
