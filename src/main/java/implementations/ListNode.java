package implementations;

//implementation of ListNode for the remove nth node problem
public class ListNode{

    public int val;
    public ListNode next;


    public ListNode(){}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }


    public void setUpTest1(ListNode head, ListNode head2){
        head.next = new ListNode(3);
        head2.next = new ListNode(7);
    }
}
