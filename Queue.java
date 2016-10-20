import java.util.Scanner;
class Queue
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList start = new LinkedList();
        LinkedList temp  = new LinkedList();
        start=null;
        char ch;
        do
        {
            System.out.print("Enter data: ");
            int n = sc.nextInt();
            LinkedList newN  = new LinkedList();
            newN.data=n;
            newN.next=null;
            if(start == null)
            {
                start = newN;
                temp = newN;
            }
            else
            {
                temp.next=newN;
                temp=newN;
            }
            System.out.println("Do you want to continue?");
            ch = sc.next().charAt(0);
        }
        while(ch=='y');
        System.out.println("A new node is to be inserted");
        System.out.print("Value of node: ");
        int n = sc.nextInt(),count=0;
        System.out.print("Position of node: ");
        int pos = sc.nextInt()-1;
        LinkedList newNode = new LinkedList(), prev = new LinkedList();
        prev=temp=start;
        newNode.data=n;
        while(true)
        {
            if(count==pos)
            {
                prev.next=newNode;
                newNode.next=temp;
                break;
            }
            count++;
            prev=temp;
            temp=temp.next;
        }
        temp=start;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }    
}
class LinkedList
{
    int data;
    LinkedList next;
}  