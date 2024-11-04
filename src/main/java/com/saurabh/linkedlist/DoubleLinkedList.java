package com.saurabh.linkedlist;

public class DoubleLinkedList {
    int data;
    DoubleLinkedList next;
    DoubleLinkedList prev;
    DoubleLinkedList(int x) {
        this.data = x;
        this.prev = null;
        this.next = null;
    }

}
