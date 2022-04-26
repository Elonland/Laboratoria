import java.util.*;

public class Test 
{
    public static int main(String args[])
    { 
        Vector<Figure> arr = new Vector<Figure>();       //it will contain all the figures.    
        SortedSet<Integer>  elements = new TreeSet<Integer>();   
        Iterator<Integer> it = elements.iterator();         //All given elements from input.
        String parameters = args[0];   //Indentifires for the figures.
        
        int count = 0;						// count is for keeping track of the input to read the correct stuff.
        final int sizeOfParameters = parameters.length();
        for(int i = 0; i < sizeOfParameters; i++) // integer i is used for reading the parameters like cccc.
        {
            int chwila;
            if(parameters.charAt(i) == 'c')    //Quadrangle handling.
            {
                boolean invalidArgument = false;
                for(int x = count; x < count + 5; x++)  //i + 5 coz quadrangle aquires 5 elements.
                {
                    try
                    {
                        chwila = Integer.parseInt(args[x + 1]);	//Wychodzimy poza tablice gdy dane sa nie pelne.
                        elements.add(chwila); //set
                    }
                    catch(final NumberFormatException e)
                    {
                        System.out.println(e);
                        invalidArgument = true;
                    }
                    catch(final ArrayIndexOutOfBoundsException f)
                    {
                        System.out.println(f);
                        elements.clear();
                        arr.removeAllElements();;
                        return 0;
                    }
                    
                }
                if(invalidArgument == true)
                {
                    count = count + 5;
                    continue;
                }
                    
                /*std::cout << "Wypisuje tablice set" << std::endl;
                for(it = elements.begin(); it != elements.end(); it++)
                    std::cout << *it << ' ';
                std::cout << std::endl;*/ 
                
                if(elements.size() == 2 || elements.size() == 1)    // Square and Rombus.
                {
                    if(elements.contains(90)) //Square
                    {
                        if(elements.size() != 1)
                            elements.remove(90); //set
                        it = elements.iterator(); //set
                        try
                        {
                            arr.add(new Square(it.next()));  //vector 
                        }
                        catch(NegativeNumber e)
                        {
                            System.out.println(e);
                        }
                        
                                
                    }
                    else        //Rombus
                    {
                        int help;
                        it = elements.iterator();
                        help = it.next();
                        if(elements.size() != 1)    //if i.e. 20 20 20 20 20
                        {
                            elements.remove(help);
                        } 
                        try
                        {
                            arr.add(new Rombus(it.next(),help)); //vector 
                        }
                        catch(final NegativeNumber e)
                        {
                            System.out.println(e);
                        }
                        catch(final WrongData k)
                        {
                            System.out.println(k);
                        }
                        catch(final NoSuchElementException l)
                        {
                            System.out.println(l);
                        }
                        
                    }
    
                    /*std::cout << "Co jest w wektorze:" << std::endl;
                    for(itArr = arr.begin(); itArr != arr.end(); itArr++)
                        std::cout << (*itArr)->area() << ' ';
                    std::cout << '\n';*/
                }
                else if(elements.size() == 3)   //Rectangle
                {
                    if(elements.contains(90))
                    {
                        elements.remove(90);
    
                        int help;
                        it = elements.iterator();
                        help = it.next();
                        //elements.remove(help);
                        try
                        {
                            arr.add(new Rectangle(it.next(),help));  //vector 
                        }
                        catch(NegativeNumber e)
                        {
                            System.out.println(e);
                        }
                    }
                    else
                        System.out.println("Rectangle must have 90 degres");
    
                }
                else
                    System.out.println("Given sides don't match any figure");
                count = count + 5;
                elements.clear();   //We erase set.
            }
            else if(parameters.charAt(i) == 'o'  
                 || parameters.charAt(i) == 'p'
                 || parameters.charAt(i) == 's')
            {
                try
                {
                    chwila = Integer.parseInt(args[count + 2]);	//Wychodzimy poza tablice gdy dane sa nie pelne.
                    elements.add(chwila); //set
                    it = elements.iterator();
                    if(parameters.charAt(i) == 'o')
                    {
                        arr.add(new Circle(it.next()));
                    }    
                    else if(parameters.charAt(i) == 'p')
                    {
                        arr.add(new Pentagon(it.next()));
                    }
                    else if(parameters.charAt(i) == 's')
                    {
                        arr.add(new Hexagon(it.next()));
                    }
                }
                catch(NumberFormatException e)
                {
                    System.out.println(e);
                }
                catch(ArrayIndexOutOfBoundsException f)
                {
                    System.out.println(f);
                    elements.clear();
                    arr.removeAllElements();
                    return 0;
                }
                catch(final NoSuchElementException l)
                {
                    System.out.println(l);
                }
                catch(final NegativeNumber e)
                {
                    System.out.println(e);
                }
                
    
                elements.clear();
                count++;
            }
            else
            {
                System.out.println("Wrong letter sorry (c, o, p, s)");
                return 0;
            }
        }
        arr.forEach((n) -> print(n));
    
        arr.removeAllElements();
        return 0;  
    }

    public static void print(Figure n)
    {
        System.out.println("Area " + n.area() + " " + "Perimeter " + n.perimeter());
                            
    }
    
}
