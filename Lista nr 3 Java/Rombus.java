import java.lang.Math;
class Rombus extends Quadrangle
{
    private static final double PI = 3.14159265;
    public Rombus(int a, int b) throws NegativeNumber, WrongData
    {
        if(a < 0 || b < 0)
        throw new NegativeNumber();
        if((b >= a && b < 180) || (b <= a && a > 180 && b < 180))
        {
            side1 = a;
            angle = b;   
        }
        else if((b > a && b > 180 && a < 180) || (b < a && a < 180))
        {
            side1 = b;
            angle = a;
        }
        else
            throw new WrongData();  
        }
    public int area()
    {
        return (int)(side1 * side1 * Math.sin(angle * PI/180));
    }
    public int perimeter()
    {
        return 4*side1;
    }
    public String getNAME()
    {
        return "Rombus";
    }

}