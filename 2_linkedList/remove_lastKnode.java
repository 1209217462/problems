/**
 * Created by rayfay-nb-001 on 2017/11/6.
 */
//page 35
//删除单链表和双链表的倒数第k个节点
public class remove_lastKnode {

    public class Node{
        public  int value;
        public Node next;
        public Node(int data){
            value=data;
        }
    }

    public Node removeLastKthNode(Node head,int k){
        Node cur=head;
        while (cur != null){
            k--;
            cur=cur.next;
        }
        //k==链表长度, 倒数第k个正好是第一个
        if (k==0){
            head=head.next;
        }
        if (k<0){
            cur=head;
            while (k!=0){
                cur=cur.next;
                k++;
            }
            //定位到要删的前一个地方 ,删了cur.next
            cur.next=cur.next.next;
        }
        return head;
    }

}
