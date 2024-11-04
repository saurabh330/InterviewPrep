package com.saurabh.linkedlist.circular;

public class DeleteHead {
    public static Node deleteHead(Node head) {
        if ( head == null) return null;
        if ( head.next == head) return null;
        Node curr = head;
        while ( curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        return curr.next;
    }
    public static final Node deleteHeadEfficient(Node head) {
        if (head == null || head.next == head ) return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head = deleteHead(head);
        head = deleteHeadEfficient(head);
        CircularLinkedListTraversal.printList(head);
    }
}
