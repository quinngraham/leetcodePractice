package solutions;

import implementations.ListNode;

public class MergeTwoSortedLLs{
    public MergeTwoSortedLLs(){

    }

    public ListNode solution(ListNode list1, ListNode list2){
        if(list1 == null || list2 == null)
            return list1 == list2 ? null : list1 == null ? list2 : list1; //didn't know you could do this lol
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode sol = l1.val >= l2.val ? l2 : l1;
        if(l1 == sol)
            l1 = l1.next;
        else
            l2 = l2.next;
        ListNode worker = sol;
        while(true){
            if(l1 == null){
                while(l2 != null){
                    worker.next = l2;
                    worker = l2;
                    l2 = l2.next;
                }
                break;
            }
            else if(l2 == null){
                while(l1 != null){
                    worker.next = l1;
                    worker = l1;
                    l1 = l1.next;
                }
                break;
            }
            if(l1.val >= l2.val){
                worker.next = l2;
                worker = l2;
                l2 = l2.next;
            }
            else{
                worker.next = l1;
                worker = l1;
                l1 = l1.next;
            }
        }
        return sol;
    }
}
