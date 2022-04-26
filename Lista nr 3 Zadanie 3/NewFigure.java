import java.lang.Math;
public class NewFigure 
{
    private static final double PI = 3.14159265;
    private static final double Constant = 2.59808;
    private static final double ConstantP = 1.72048;
        public enum OneParameter implements forOneParameter
        {
            Circle
            {
                public int perimeter(int radius) throws NegativeNumber
                {
                    if(radius < 0)
                        throw new NegativeNumber();
                    return (int)(2 * radius * PI);
                }
                public int area(int radius)  throws NegativeNumber
                {
                    if(radius < 0)
                        throw new NegativeNumber();
                    return (int)(radius * radius * PI);
                }
                public String getNAME()
                {
                    return "Circle";
                }
            },
            Square
            {
                public int perimeter(int side1)  throws NegativeNumber
                {
                    if(side1 < 0)
                        throw new NegativeNumber();
                    return 4*side1;
                }
                public int area(int side1)  throws NegativeNumber
                {
                    if(side1 < 0)
                        throw new NegativeNumber();
                    return side1 * side1;
                }
                public String getNAME()
                {
                    return "Square";
                }
            },
            Hexagon
            {
                public int perimeter(int side)  throws NegativeNumber
                {
                    if(side < 0)
                        throw new NegativeNumber();
                    return 6 * side;
                }
                public int area(int side)  throws NegativeNumber
                {
                    if(side < 0)
                        throw new NegativeNumber();
                    return (int)(side * side * Constant);
                }
                public String getNAME()
                {
                    return "Hexagon";
                }
            },
            Pentagon
            {
                public int perimeter(int side)  throws NegativeNumber
                {
                    if(side < 0)
                        throw new NegativeNumber();
                    return 5 * side;
                } 
                public int area(int side)  throws NegativeNumber
                {
                    if(side < 0)
                        throw new NegativeNumber();
                    return (int)(side * side * ConstantP);
                }
                public String getNAME()
                {
                    return "Pentagon";
                }
            };
        }
        public enum TwoParameters implements forTwoParameters
        {
            Rectangle
            {
                public int perimeter(int side1, int side2)  throws NegativeNumber
                {
                    if(side1 < 0 || side2 < 0)
                        throw new NegativeNumber();
                    return 2*side1 + 2*side2;
                }
                public int area(int side1, int side2)  throws NegativeNumber
                {
                    if(side1 < 0 || side2 < 0)
                        throw new NegativeNumber();
                    return side1 * side2;
                }
                public String getNAME()
                {
                    return "Rectangle";
                }
            },
            Rombus
            {
                public int perimeter(int side1, int side2)  throws NegativeNumber
                {
                    if(side1 < 0 || side2 < 0)
                        throw new NegativeNumber();
                    return 4*side1;
                }
                public int area(int side1, int angle)  throws NegativeNumber
                {
                    if(angle >= 180)
                        throw new NegativeNumber();
                    if(side1 < 0 || angle < 0)
                        throw new NegativeNumber();
                    return (int)(side1 * side1 * Math.sin(angle * PI/180));
                } 
                public String getNAME()
                {
                    return "Rombus";
                }

            };
        }
    public interface forOneParameter
    {
        public abstract int area(int a) throws NegativeNumber;
        public abstract int perimeter(int a) throws NegativeNumber;
        public abstract String getNAME();   
    }
    public interface forTwoParameters
    {
        public abstract int area(int a, int b) throws NegativeNumber;
        public abstract int perimeter(int a, int b) throws NegativeNumber;
        public abstract String getNAME();   
    }

    public static void main(String args[])
    {
        if(args.length == 0)
        {
            System.out.println("No data");
            System.exit(0);
        }
        int index = 1;
        int side1, side2, angle;

        for(int i = 0; i < args[0].length(); i++)
        {
            //r rectangle, q rombus
            if(args[0].toLowerCase().charAt(index) == 'o')
            {
                try
                {
                    side1 = Integer.parseInt(args[index]);
                    if(side1 < 0)
                        
                    System.out.println(OneParameter.Circle.getNAME() + " ");
                    System.out.println("Area: " + OneParameter.Circle.area(side1));
                    System.out.println("Perimeter: " + OneParameter.Circle.perimeter(side1));
                }
                catch(NumberFormatException e)
                {
                    System.out.println(args[index] + " wrong radius");
                }
                catch(NegativeNumber f)
                {
                    System.out.println((f));
                }
                catch(final ArrayIndexOutOfBoundsException a)
                {
                    System.out.println("You missed some sides");
                    System.exit(0);
                }
                index++;
            } 
            if(args[0].toLowerCase().charAt(index) == 'p')
            {
                try
                {
                    side1 = Integer.parseInt(args[index]);
                    System.out.println(OneParameter.Pentagon.getNAME() + " ");
                    System.out.println("Area: " + OneParameter.Pentagon.area(side1));
                    System.out.println("Area: " + OneParameter.Pentagon.perimeter(side1));
                }
                catch(NumberFormatException e)
                {
                    System.out.println(args[index] + " wrong data");
                }
                catch(NegativeNumber f)
                {
                    System.out.println((f));
                }
                catch(final ArrayIndexOutOfBoundsException a)
                {
                    System.out.println("You missed some sides");
                    System.exit(0);
                }
                index++;
            }
            if(args[0].toLowerCase().charAt(index) == 's')
            {
                try
                {
                    side1 = Integer.parseInt(args[index]);
                    System.out.println(OneParameter.Hexagon.getNAME() + " ");
                    System.out.println("Area: " + OneParameter.Hexagon.area(side1));
                    System.out.println("Area: " + OneParameter.Hexagon.perimeter(side1));
                }
                catch(NumberFormatException e)
                {
                    System.out.println(args[index] + " wrong data");
                }
                catch(NegativeNumber f)
                {
                    System.out.println((f));
                }
                catch(final ArrayIndexOutOfBoundsException a)
                {
                    System.out.println("You missed some sides");
                    System.exit(0);
                }
                index++;
            }
            if(args[0].toLowerCase().charAt(index) == 'c')
            {
                try
                {
                    side1 = Integer.parseInt(args[index]);
                    System.out.println(OneParameter.Square.getNAME() + " ");
                    System.out.println("Area: " + OneParameter.Square.area(side1));
                    System.out.println("Area: " + OneParameter.Square.perimeter(side1));
                }
                catch(NumberFormatException e)
                {
                    System.out.println(args[index] + " wrong side");
                }
                catch(NegativeNumber f)
                {
                    System.out.println((f));
                }
                catch(final ArrayIndexOutOfBoundsException a)
                {
                    System.out.println("You missed some sides");
                    System.exit(0);
                }
                index++;
            }
            if(args[0].toLowerCase().charAt(index) == 'r')
            {
                try
                {
                    side1 = Integer.parseInt(args[index]);
                    angle = Integer.parseInt(args[index + 1]);
                    if(angle > 180 && side1 < 180)
                    {
                        side1 = angle + side1;
                        angle = side1 - angle;
                        side1 = side1 - angle;
                    }
                        
                    System.out.println(TwoParameters.Rombus.getNAME() + " ");
                    System.out.println("Area: " + TwoParameters.Rombus.area(side1, angle));
                    System.out.println("Area: " + TwoParameters.Rombus.perimeter(side1, angle)); 
                }
                catch(NumberFormatException e)
                {
                    System.out.println(args[index] + " wrong side or angle");
                }
                catch(NegativeNumber f)
                {
                    System.out.println((f + "or wrong angle"));
                }
                catch(final ArrayIndexOutOfBoundsException a)
                {
                    System.out.println("You missed some sides");
                    System.exit(0);
                }
                index = index + 2;
            }
            if(args[0].toLowerCase().charAt(index) == 'q')
            {
                try
                {
                    side1 = Integer.parseInt(args[index]);
                    side2 = Integer.parseInt(args[index + 1]);
                    System.out.println(TwoParameters.Rectangle.getNAME() + " ");
                    System.out.println("Area: " + TwoParameters.Rectangle.area(side1, side2));
                    System.out.println("Area: " + TwoParameters.Rectangle.perimeter(side1, side2));
                    
                }
                catch(NumberFormatException e)
                {
                    System.out.println(args[index] + " " + args[index + 1] + " wrong sides");
                }
                catch(NegativeNumber f)
                {
                    System.out.println((f));
                }
                catch(final ArrayIndexOutOfBoundsException a)
                {
                    System.out.println("You missed some sides");
                    System.exit(0);
                }
                index = index + 2;
            }
        }

        

    }//end of main
    
}
