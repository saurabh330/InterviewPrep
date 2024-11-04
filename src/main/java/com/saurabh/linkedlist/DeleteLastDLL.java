package com.saurabh.linkedlist;

public class DeleteLastDLL {
    public static Node deleteLastDLL (Node head) {
        if (head == null || head.next == null) return null;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head = deleteLastDLL(head);
        PrintingList.printList(head);
    }
}
