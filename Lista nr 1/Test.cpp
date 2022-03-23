#include <iostream>
#include "LiczbyPierwsze.hpp"
    int main(int argc, char *argv[])
    {
	using namespace std;
	unsigned int argcNew = static_cast<unsigned int>(argc);
        int* tabl = new int[argcNew];
        for(int i = 0; i < argc - 1; i++)
        {
		try
		{
		  tabl[i] = stoi(argv[i+1]);
		}
		catch (invalid_argument ex) 
		{
		  cout << argv[i] << " - nieprawdidlowa dana" << endl;
		}
        }

	if(tabl[0] >= 2)
	{
          LiczbyPierwsze *nowy = new LiczbyPierwsze(tabl[0]);

          for(int i = 1; i < argc - 1; i++)
          {
	    if(tabl[i]  < 0 || nowy->liczba(tabl[i]) == 0)
	      cout << tabl[i] << " - liczba spoza zakresu" << endl;
	    else
	      cout << tabl[i] << " - " << nowy->liczba(tabl[i]) << endl;
          }
          delete nowy;
	}
	else
	  cout << "Bledny zakres" << endl;

      delete[] tabl;
    }

