package com.saurabh.linkedlist;

public class DeleteWithOnlyPointer {
    public static Node deleteNodeWithPointer(Node ptr) {
        ptr.data = ptr.next.data;
        ptr.next = ptr.next.next;
        return ptr;
    }
}
