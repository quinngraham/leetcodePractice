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


    public void setUpTest1(ListNode head){
        head.val = 1;
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
    }

    public static void printNodes(ListNode head){
        ListNode l = head;
        while(l != null){
            System.out.print(l.val + ", ");
            l = l.next;
        }
        System.out.println();
    }
}
