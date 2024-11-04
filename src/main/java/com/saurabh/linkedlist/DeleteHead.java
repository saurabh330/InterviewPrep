package com.saurabh.linkedlist;

public class DeleteHead {
    static Node delHead(Node head) {
        if (head == null) return null;
        else return head.next;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head = delHead(head);
        PrintingList.printList(head);
    }
}
