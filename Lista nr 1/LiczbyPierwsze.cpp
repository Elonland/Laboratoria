#include <iostream>

#include "LiczbyPierwsze.hpp"

class LiczbyPierwsze
{
	
	//Constructor creates array from 2 to n.
	LiczbyPierwsze(int range)
	{
	  int* n = malloc(sizeof(int));
	  using namespace std;
	  n = &range;
	  int* tab[] = new int[range - 1];
    	  for(int i = 0; i <= range - 2; i++)
      	    tab[i] = i + 2;
      	  
    	  for(int i = 2; i*i <= range; i++)
    	  {
      	    if(tab[i-2] != 0)//It checks if the number was deleted.
      	    {
              for(int p = i*i; p <= range; p += i)
	        tab[p-2] = 0;
      	    }
    	  }
    	  /*
    	    The loop below moves next prime numbers to delete 0 which are between
    	    them.
    	  */
    	  int count = 0;
    	  for(int i = 0; i < range - 1; i++)
    	  {				    
    	    if(tab[i] != 0)
    	    {
    	      tab[count] = tab[i];
    	      count++;
    	      /*
    	        At the beginning we have 2 prime numbers next to each other 2, 3 and obvioulsy we
    	        can't delete them.
    	      */
    	      if(i > 1)
    	        tab[i] = 0;
    	    }
    	  }
	}
	
	//Method writes the m prime number.
	public int liczba(int m)
	{
	  using namespace std;
	  if(m <= n - 2)
	    return tab[m];
	  else 
	    return 0;
	};
	delete tab;
	delete n;
//std::ostream & operator<<(std::ostream & out, LiczbyPierwsze * t) { return out<<t->t; };
};
