package com.saurabh.linkedlist;

import java.util.HashMap;

public class CloneLLRandomPointers {
    public static RandomNode cloneWithRandom(RandomNode head) {
        HashMap<RandomNode,RandomNode> map = new HashMap<>();
        for ( RandomNode curr= head; curr!= null; curr = curr.next) {
            map.put(curr,new RandomNode(curr.data));
        }
        for ( RandomNode curr= head; curr!= null; curr = curr.next) {
            RandomNode clone = map.get(curr);
            clone.next = map.get(curr.next);
            clone.random = map.get(curr.random);
        }
        RandomNode head2 = map.get(head);
        return head2;
    }
    public static void main(String[] args)
    {
        RandomNode head = new RandomNode(10);
        head.next = new RandomNode(5);
        head.next.next = new RandomNode(20);
        head.next.next.next = new RandomNode(15);
        head.next.next.next.next = new RandomNode(20);

        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        RandomNode cloned_list = cloneWithRandom(head);
    }
}
