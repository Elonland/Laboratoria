#ifndef Square_H
#define Square_H

#include "Quadrangle.hpp"

class Square : virtual Quadrangle
{
    public:
    Square(int a);
    virtual int area();
    virtual int perimeter();
};

#endif