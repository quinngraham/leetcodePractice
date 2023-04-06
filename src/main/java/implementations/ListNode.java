package implementations;

//implementation of ListNode for the remove nth node problem
public class ListNode{

    int val;
    public ListNode next;


    public ListNode(){}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }


    public void setUpTest1(ListNode head){
        ListNode l1 = new ListNode(2);
        //ListNode l2 = new ListNode(3);
        //ListNode l3 = new ListNode(4);
        //ListNode l4 = new ListNode(5);
        head.next = l1;
        l1.next = null;
        //l2.next = l3;
        //l3.next = l4;
        //l4.next = null;
    }
}
