public class Test
{
    public static void main(String args[])
    {
        int tabl[] = new int[args.length];
        for(int i = 0; i < args.length; i++)
        {
		try
		{
		  tabl[i] = Integer.parseInt(args[i]);
		}
		catch (NumberFormatException ex) 
		{
		  System.out.println(args[i] + " - nieprawdidlowa dana");
		}
        }

	if(tabl[0] >= 2)
	{
          LiczbyPierwsze nowy = new LiczbyPierwsze(tabl[0]);

          for(int i = 1; i < args.length; i++)
          {
	    if(tabl[i]  < 0 || nowy.liczba(tabl[i]) == 0)
	      System.out.println(tabl[i] + " - liczba spoza zakresu");
	    else
	      System.out.println(tabl[i] + " - " + nowy.liczba(tabl[i]));
          }

	}
	else
	  System.out.println("Bledny zakres");

    }
}
