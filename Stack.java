class Stack
{
    int arr[] = new int[10];
    int top;
    Stack()
    {   top = -1;   }
    void push(int x)
    {
      if(top>=9)
      {
        System.out.println("Stack is full"); return;
      }
      top++;
      arr[top] = x;
    }
    int pop()
    {
      int v = 0;
      if(top<0)
      {
        System.out.println("Stack is empty");
        return -999;
      }
      v = arr[top];
      top--;
      return v;
    }
    void display()
    {
      if(top<0) { System.out.println("Stack is empty"); return;}
      for(int i=top;i>=0;i--)
      { System.out.println(arr[top]);}
    }
}
