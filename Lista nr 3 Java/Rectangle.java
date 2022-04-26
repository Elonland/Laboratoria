class Rectangle extends Quadrangle
{
    public Rectangle(int a, int b) throws NegativeNumber
    {
        if(a < 0 || b < 0)
        throw new NegativeNumber();
        side1 = a;
        side2 = b;
    }
    public int area()
    {
        return side1 * side2;
    }
    public int perimeter()
    {
        return 2*side1 + 2*side2;
    }
    public String getNAME()
    {
        return "Rectangle";
    }
}