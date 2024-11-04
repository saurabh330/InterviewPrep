package com.saurabh.linkedlist.circular;

import com.saurabh.linkedlist.PrintingList;

public class InsertEnd {
    public static Node insertEndEfficient(Node head, int x) {
        Node temp = new Node(x);
        if ( head == null) {
            temp.next = temp;
            return temp;
        } else {
            temp.next = head.next;
            head.next = temp;
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
            return temp;
        }
    }
    public static Node insertEnd(Node head,int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        } else {
            Node curr = head;
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
            return head;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = head;
        head = insertEnd(head,30);
        head = insertEndEfficient(head,40);
        CircularLinkedListTraversal.printList(head);
    }
}
