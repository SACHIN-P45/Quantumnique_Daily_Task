import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int value)
    {
        this.data=value;
        this.next=null;
    }
}
class Solution
{
    Node middleNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
class middle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(head==null)
            {
                head=tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
        }
        Solution obj=new Solution();
        head=obj.middleNode(head);
        System.out.println(head.data);
    }

}
