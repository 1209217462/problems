/**
 * Created by rayfay-nb-001 on 2017/11/5.
 */

//打印两个有序链表的公共部分
public class printCommonPart_in_2linkedList {

    //链表的一个节点
    public class Node{
        public  int value;
        public Node next;
        public Node(int data){
            value=data;
        }
    }

    /**
     * 两个链表的头结点
     * @param head1
     * @param head2
     */
    public void printCommonPart(Node head1,Node head2){
        while (head1.next!=null && head2.next!=null) {
            if (head1.value < head2.value){
                head1= head1.next;
            }
            else if (head1.value>head2.value){
                head2=head2.next;
            }
            else {
                System.out.println(head1.value);
                head1= head1.next;
                head2=head2.next;
            }
        }
    }

}
