package com.saurabh.linkedlist;

public class ReverseInNGroups {
    public static Node reverseK(Node head,int k) {
        Node curr = head, next = null, prev = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if ( next != null) {
            Node restHead = reverseK(next,k);
            head.next = restHead;
        }
    return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head = reverseK(head,4);
        PrintingList.printList(head);
    }
}
