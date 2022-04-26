class Circle implements Figure
{
    private static final double PI = 3.14159265;
    private int radius;
    public Circle(int a) throws NegativeNumber
    {
        if(a < 0)
        throw new NegativeNumber();
        radius = a;
    }
    public int area()
    {
        return (int)(radius * radius * PI);
    }
    public int perimeter()
    {
        return (int)(2 * radius * PI);
    }
    public String getNAME()
    {
        return "Circle";
    }
}