package com.saurabh.linkedlist.circular;

public class CircularLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        CircularLinkedListTraversal.printList(head);
    }

}
