#include "PascalTriangle.hpp"
#include "MyException.cpp"

PascalTriangle::PascalTriangle(int n)
{
    a = n;
    generateTab(n);
}

long int PascalTriangle::value(int m)
{
    if(m < 0 || m >= a)
            throw new MyException(std::string(m + " - invalid range"));
            return tab[m];  
}

PascalTriangle::~PascalTriangle()
{
    delete[] tab;
}