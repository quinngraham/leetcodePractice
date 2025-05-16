package solutions;

import implementations.ListNode;

public class DeleteDuplicates{
    public DeleteDuplicates(){

    }

    public ListNode Solution(ListNode head){
        /*
            Just have to check if the one next is the same as current and then keep progressing
            down the chain until you get a unique val (loop)
        */
        ListNode worker = head;

        while(worker != null && worker.next != null){
            while(worker.next != null && worker.val == worker.next.val){
                worker.next = worker.next.next;
            }
            worker = worker.next;
        }
        return head;
    }

}
