#include "Square.hpp"
#include "Quadrangle.hpp"

Square::Square(int a)
{
    side1 = a;
}

int Square::area()
{
    return side1 * side1;
}
int Square::perimeter()
{
    return 4*side1;
}