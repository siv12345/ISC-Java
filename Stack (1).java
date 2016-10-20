import java.util.Scanner;
class Stack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedList start = new LinkedList();
        start=null;
        char ch;
        do
        {
            System.out.print("Enter data: ");
            int n = sc.nextInt();
            LinkedList newN  = new LinkedList();
            newN.data=n;
            newN.next=start;
            start=newN;
            System.out.println("Do you want to continue?");
            ch = sc.next().charAt(0);
        }
        while(ch=='y');
        while(start!=null)
        {
            System.out.println(start.data);
            start=start.next;
        }
    }
}