package com.saurabh.linkedlist;

public class PrintingList {
    public static void printList(Node head) {
        Node curr = head;
        while ( curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        printList(head);

    }
}
