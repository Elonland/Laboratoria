class Hexagon implements Figure
{
    private static final double Constant = 2.59808;
    private int side;
    public Hexagon(int a) throws NegativeNumber
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
        return 6 * side;
    }
    public String getNAME()
    {
        return "Hexagon";
    }

}