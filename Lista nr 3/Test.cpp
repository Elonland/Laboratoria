#include <iostream>
#include "Square.hpp"
int main(int argc, char *argv[])
{
    Square *newSquare = new Square(2);
    std::cout << newSquare->area() << " " << newSquare->perimeter();

	delete newSquare;
    return 0;
}
