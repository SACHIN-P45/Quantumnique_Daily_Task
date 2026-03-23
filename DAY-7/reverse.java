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
    Node reverse(Node head)
    {
        Node currnNode=head;
        Node prNode=null;
        while(currnNode!=null)
        {
            Node next=currnNode.next;
            currnNode.next=prNode;
            prNode=currnNode;
            currnNode=next;
        }
        return prNode;
    }
}
class reverse
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
        head=obj.reverse(head);

        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}