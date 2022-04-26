class Pentagon implements Figure
{
    private static final double Constant = 1.72048;
    private int side;
    public Pentagon(int a) throws NegativeNumber
    {
        if(a < 0)
        throw new NegativeNumber();
        side = a;
    }
    public int area()
    {
        return (int)(side * side * Constant);
    }
    public int perimeter()
    {
        return 5 * side;
    }
    public String getNAME()
    {
        return "Pentagon";
    }
}