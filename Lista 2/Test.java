public class Test 
{
    public static void main(String args[])
    {
        int Input[] = new int[args.length];
        for(int i = 0; i < args.length; i++)
        {
            try
            {
                Input[i] = Integer.parseInt(args[i]);
            }
            catch(final NumberFormatException e)
            {
                Input[i] = 0;
            }   
        }
        
        

        WierszTrojkataPascala Object;
        try
        {
            final int k = Input[0];
            Object = new WierszTrojkataPascala(k);//Generates the row
        }
        catch (final MyException f)
        {
            System.out.println(f);
            return;
        } 
        

        for(int i = 1; i < args.length; i++)//Prints the values.
        {
            try
            {
                if(Input[i] == 0)
                    System.out.println(args[i] + " - invalid input");   
                final int m = Input[i];
                System.out.println(m + " - " + Object.wspolczynnik(m));   
            }
            catch (final MyException e)
            {
                System.out.println(e);
            }
            
        }
            
    }
    
}
