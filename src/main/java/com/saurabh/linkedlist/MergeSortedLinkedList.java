package com.saurabh.linkedlist;

public class MergeSortedLinkedList {
    public static Node sortedMerge(Node a, Node b) {
        if ( a == null ) return b;
        if ( b == null ) return a;
        Node head = null, tail = null;
        if (a.data <= b.data) {
            head = tail = a; a = a.next;
        } else {
            head = tail = b; b = b.next;
        }
        while ( a!= null && b != null) {
            if ( a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if ( a == null ) tail.next = b;
        else tail.next = a;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(35);

        Node head1 = new Node(5);
        head1.next = new Node(30);
        head = sortedMerge(head,head1);
        PrintingList.printList(head);
    }
}
