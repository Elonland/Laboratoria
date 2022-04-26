public class Square extends Quadrangle
{
    public Square(int a) throws NegativeNumber
    {
        if(a < 0)
            throw new NegativeNumber();
        side1 = a;
    }
    public int area()
    {
        return side1 * side1;
    }
    public int perimeter()
    {
        return 4*side1;
    }
    public String getNAME()
    {
        return "Square";
    }
}
