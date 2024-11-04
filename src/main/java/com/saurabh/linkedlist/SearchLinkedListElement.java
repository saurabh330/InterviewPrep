package com.saurabh.linkedlist;

public class SearchLinkedListElement {
    static int iterativeSearch(Node head,int x) {
        Node curr = head;
        int pos = 1;
        while (curr != null) {
            if (curr.data == x) {
                return pos;
            } else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
    static int recursiveSearch(Node head,int x) {
        if (head == null) return -1;
        if (head.data == x) return 1;
        else {
            int res = recursiveSearch(head.next,x);
            if (res == -1) return -1;
            else return (res + 1);
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println("Iterative search for 20 pos = "+ iterativeSearch(head,20));
        System.out.println("Recursive search for 30 pos = "+ recursiveSearch(head,30));
    }
}
