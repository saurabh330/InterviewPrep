package com.saurabh.linkedlist;

public class DeleteLastNode {
    static Node delLastNode(Node head) {
        if (head == null) return null;
        if (head.next == null) return null;
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        delLastNode(head);
        PrintingList.printList(head);
    }
}
