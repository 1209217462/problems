/**
 * Created by rayfay-nb-001 on 2017/11/6.
 */
//page 41
//反转链表  单向和双向
public class ReverseList {
    public class Node{
        public  int value;
        public Node next;
        public Node(int data){
            value=data;
        }
    }

    public Node reverseList(Node head){
        Node newHead=null;
        Node next=null;
        while (head!=null){
            next=head.next;
            head.next=newHead;
            newHead=head;
            head=next;
        }
        return newHead;
    }
}
