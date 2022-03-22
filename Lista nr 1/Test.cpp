#include <iostream>
#include "LiczbyPierwsze.hpp"
    public static void main(int argc, char *argv[])
    {
	using namespace std;
        int tabl[] = new int[argv.length];
        for(int i = 0; i < args.length; i++)
        {
		try
		{
		  tabl[i] = Integer.parseInt(args[i]);
		}
		catch (NumberFormatException ex) 
		{
		  cout << argv[i] << " - nieprawdidlowa dana" << endl;
		}
        }

	if(tabl[0] >= 2)
	{
          LiczbyPierwsze *nowy = new LiczbyPierwsze(tabl[0]);

          for(int i = 1; i < args.length; i++)
          {
	    if(tabl[i]  < 0 || nowy->liczba(tabl[i]) == 0)
	      cout << tabl[i] << " - liczba spoza zakresu" << endl;
	    else
	      cout << tabl[i] << " - " << nowy->liczba(tabl[i]) << endl;
          }

	}
	else
	  cout << "Bledny zakres" << endl;

    delete nowy;
    }

