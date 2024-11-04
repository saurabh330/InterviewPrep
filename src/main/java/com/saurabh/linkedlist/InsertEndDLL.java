package com.saurabh.linkedlist;

public class InsertEndDLL {
    static Node insertAtEnd(Node head,int x) {
        Node temp = new Node(x);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head = insertAtEnd(head,30);
        PrintingList.printList(head);
    }
}
