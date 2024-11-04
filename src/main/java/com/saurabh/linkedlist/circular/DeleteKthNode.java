package com.saurabh.linkedlist.circular;

public class DeleteKthNode {
    public static final Node deleteKthNode(Node head, int k) {
        if ( head == null) return head;
        if ( k == 1) return DeleteHead.deleteHead(head);
        Node curr = head;
        for ( int i = 0; i< k-2; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;
        head = deleteKthNode(head,2);
        CircularLinkedListTraversal.printList(head);
    }
}
