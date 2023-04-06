package org.lol;
import implementations.ListNode;
import solutions.*;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        //This is where I'll be running my tests, it'll be empty most of the time (unless i'm actively working on one)
        RemoveNthNode n = new RemoveNthNode();
        ListNode head = new ListNode(1);
        head.setUpTest1(head);
        System.out.println(n.solution(head, 2));
    }
}