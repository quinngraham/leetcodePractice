package solutions;

import implementations.ListNode;


/*
 * Sample code that removes the nth node from a linked list.
 * The reason the solution is stored in a helper function is
 * because I have been practicing leetcode problems and my testing uniformly
 * calls .solution(args) for every class I write.
 */

public class RemoveNthNode{
    public RemoveNthNode(){

    }

    public ListNode solution(ListNode head, int n){

        int itr = 1;
        ListNode worker = head;
        ListNode remVal = head;
        ListNode prevRem = head;
        while(worker.next != null){
            worker = worker.next;
            if(itr-n >= 0){
                prevRem = remVal;
                remVal = remVal.next;
            }
            itr++;
        }

        if(itr == 1)
            return null;
        if(prevRem == remVal)
            return remVal.next;
        prevRem.next = remVal.next;
        return head;
    }

}
