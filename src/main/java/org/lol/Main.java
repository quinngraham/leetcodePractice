package org.lol;
import implementations.ListNode;
import solutions.*;


public class Main{
    public static void main(String[] args){
        //This is where I'll be running my tests, it'll be empty most of the time (unless i'm actively working on one)
        MergeTwoSortedLLs l = new MergeTwoSortedLLs();
        ListNode l1 = new ListNode(-9);
        ListNode l2 = new ListNode(5);
        l1.setUpTest1(l1, l2);
        System.out.println(l.solution(l1, l2));
    }
}