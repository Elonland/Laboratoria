#include "PascalTriangle.hpp"
#include "MyException.hpp"
#include <iostream>
#include <string>
PascalTriangle::PascalTriangle(int n)
{

	if(n <= 0)
	{
		throw MyException();
	}
		//std::string("Row below 1 doesn't exist")
	a = n;
	tab = new long int[n];
    	//
    int div;
    if(n % 2 == 0 || n == 1)  // It changes the amount of numbers that we generate.
    	div = n/2;
    else
    	div = n/2 + 1;

    for(int i = 0; i < div; i++)// The left part of the Pascal triangle.
    {
    	tab[i] = NewtonRec(n - 1, i);
    }

    int count;
    if(n % 2 == 0)
    	count = div - 1;
    else
    	count = div - 2;

    int i = div;
    while(count >= 0)// The right part of the Pascal triangle.
    {
    	tab[i] = tab[count];
    	count--;
    	i++;
    }

}

long int PascalTriangle::NewtonRec(int n, int k)
{
    if(k == 0)
        return 1;
    else
    {
        return (NewtonRec(n - 1, k - 1)*n)/k;
    }
}

long int PascalTriangle::value(int m)
{
    if(m < 0 || m >= a)
    	throw MyException();
    	//std::string(m + " - invalid range")
    	//std::cout << m << " - invalid range" << std::endl;
    //else
    	//std::cout << m << " - " << tab[m] << std::endl;
        
    return tab[m];  
}

PascalTriangle::~PascalTriangle()
{
    delete[] tab;
}
