package com.saurabh.linkedlist;

public class DeleteHeadDLL {
    public static Node deleteHeadDLL(Node head) {
        if (head == null || head.next == null) return null;
        else {
            head = head.next;
            head.prev = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head = deleteHeadDLL(head);
        PrintingList.printList(head);
    }
}
