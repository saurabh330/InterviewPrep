package com.saurabh.linkedlist.circular;


public class InsertBegin {
    public static Node insertBeginEfficient(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;
            int t = head.data;
            head.data = temp.data;
            temp.data = t;
            return head;
        }

    }
    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        if ( head == null) temp.next = temp;
        else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = head;
        head = insertBegin(head,10);
        head = insertBeginEfficient(head,0);
        CircularLinkedListTraversal.printList(head);

    }
}
