package com.saurabh.linkedlist;

public class IntersectionPoint {
    private static int getCount(Node head) {
        int count = 0;
        Node curr = head;
        while (curr.next != null ) {
            curr = curr.next;
            count++;
        }
        return count;
    }
    public static Node getIntersectionNode(Node head1, Node head2, int diff) {
        Node curr1 = head1;
        Node curr2 = head2;
        for ( int i = 0; i < diff; i++) {
            if ( curr1 == null) return null;
            curr1 = curr1.next;
        }
        while (curr1 != null && curr2 != null) {
            if ( curr1.data == curr2.data) return curr1;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }

    public static void main(String[] args)
    {
        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(15);
        head1.next.next.next.next = new Node(30);

        Node head2 = new Node(10);
        head2.next = new Node(15);
        head2.next.next = new Node(30);

        int count1 = getCount(head1);
        int count2 = getCount(head2);
        Node intersectionNode = null;

        if (count1 > count2) {
            int d = count1 - count2;
            intersectionNode = getIntersectionNode(head1, head2, d);
        }
        else {
            int d = count2 - count1;
            intersectionNode = getIntersectionNode(head2, head1, d);
        }
        System.out.println("Intersection Node data is: "+ intersectionNode.data);
    }


}
