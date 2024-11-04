package com.saurabh.linkedlist;

public class InsertAtGivenPosition {
    static Node insertPos(Node head,int pos,int x) {
        Node temp = new Node(x);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i=1; i<=pos-2 && curr!=null; i++) {
            curr = curr.next;
        }
        if (curr == null) return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertPos(head,1,10);
        head = insertPos(head,2,20);
        head = insertPos(head,3,30);
        PrintingList.printList(head);


    }
}
