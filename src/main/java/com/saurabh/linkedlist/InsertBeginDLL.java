package com.saurabh.linkedlist;

public class InsertBeginDLL {
    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head = insertBegin(head,10);
        PrintingList.printList(head);

    }
}
