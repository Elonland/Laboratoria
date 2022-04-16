#include <iostream>
#include "Square.hpp"

int main(int argc, char *argv[])
{
    Square *newSquare = new Square(2);
    std::cout << newSquare->area();

    return 0;
}