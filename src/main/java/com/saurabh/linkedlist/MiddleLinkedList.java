package com.saurabh.linkedlist;

public class MiddleLinkedList {
    public static final void printMiddle(Node head) {
        if (head == null) return;
        Node fast = head,slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        PrintingList.printList(head);
        System.out.println();
        System.out.print("Position of middle element in Linked List: ");
        printMiddle(head);
    }
}
