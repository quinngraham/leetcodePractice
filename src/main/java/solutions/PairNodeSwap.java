package solutions;

import implementations.ListNode;

public class PairNodeSwap{
    public PairNodeSwap(){

    }

    public ListNode solution(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode firstPtr = head, retVal = null, inter = null;
        ListNode secondPtr = head.next;
        while(true){
            firstPtr.next = secondPtr.next;
            secondPtr.next = firstPtr;
            if(retVal == null)
                retVal = secondPtr;
            if(firstPtr.next == null || firstPtr.next.next == null)
                break;
            inter = firstPtr;
            firstPtr = firstPtr.next;
            secondPtr = firstPtr.next;
            inter.next = secondPtr;
        }
         return retVal;
    }
}
