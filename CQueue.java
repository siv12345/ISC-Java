class CQueue
{
  int arr[] = new int[10];
  int count, front, rear;
  CQueue()
  { front = -1; rear = -1; count = 0;}
  void insert(int x)
  {
    if(count>=10)
    { System.out.println("Queue is full"); return;}
    if(front == -1) front = 0;
    rear = (rear+1)%10;
    arr[rear] = x;
    count++;
  }
  int remove()
  {
    if(count==0)
    { System.out.println("Queue is empty"); return -999;}
    int x = arr[front];
    arr[front] = 0;
    front = (front+1)%10;
    count--;
    return x;
  }
  void display()
  {
    if(count>0)
    {
      int i=front;
      while(true)
      {
          System.out.println(arr[i]);
          i = (i+1)%10;
          if(i==rear)
          {   System.out.println(arr[i]);
              break;
          }
      }
    }
    else System.out.println("Queue is empty");
  }
  void fill()
  {
      for(int i=1;i<=10;i++)
      { insert(i);  }
  }
}
