package com.saurabh.linkedlist;

public class RecursiveTraversal {
    public static void recPrint(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        recPrint(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        recPrint(head);

    }
}
