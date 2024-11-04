package com.saurabh.linkedlist;

public class ReverseDLL {
    static Node reverseList(Node head) {
        if (head == null || head.next == null) return head;
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;

        }
        return prev.prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = reverseList(head);
        PrintingList.printList(head);
    }
}
