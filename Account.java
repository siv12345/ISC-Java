class Account extends Bank
{
    double amt;
    Account(double a)
    {
        super("ABC",123,1500);
        amt = a;
    }
    void deposit()
    {
        p = p+amt;
    }
}