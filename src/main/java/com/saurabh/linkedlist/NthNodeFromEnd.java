package com.saurabh.linkedlist;

public class NthNodeFromEnd {
    public static void nthNodeFromEnd(Node head, int n) {
        if ( head == null) return;
        Node first = head;
        for ( int i = 0; i < n; i++) {
            if ( first == null) return;
            first = first.next;
        }
        Node second = head;
        while ( first != null) {
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        PrintingList.printList(head);
        System.out.println();
        System.out.print("Nth node from end of Linked List: ");
        nthNodeFromEnd(head,2);
    }
}
