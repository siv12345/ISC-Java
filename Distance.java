class Distance
{
    int feet,inch;
    Distance()
    {
        feet = 0; inch = 0;
    }
    Distance(int f,int i)
    {
        feet = f;
        inch = i;
    }
    Distance add(Distance d1)
    {
        int f = this.feet + d1.feet;
        int i = this.inch + d1.inch;
        return new Distance(f,i);
    }
    void display()
    {
        System.out.println("Feet ="+feet+" Inch ="+inch);
    }
    static void main()
    {
        Distance ob1 = new Distance(2,3);
        Distance ob2 = new Distance(5,6);
        Distance ob3 = ob1.add(ob2);
        ob3.display();
    }
}