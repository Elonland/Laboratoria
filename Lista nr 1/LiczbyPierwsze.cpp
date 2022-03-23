#include <iostream>

#include "LiczbyPierwsze.hpp"
	
	//Constructor creates array from 2 to n.
	LiczbyPierwsze::LiczbyPierwsze(int range)
	{
	  using namespace std;
	  n = range;
	  unsigned int rangeNew = static_cast<unsigned int>(range);
	  tab = new int[rangeNew - 1];
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
    	  unsigned int count = 0;
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
	int LiczbyPierwsze::liczba(int m)
	{
	  using namespace std;
	  if(m <= n - 2)
	    return tab[m];
	  else 
	    return 0;
	}
	LiczbyPierwsze::~LiczbyPierwsze()
	{
	  delete[] tab;
	}


