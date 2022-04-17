#include <iostream>
#include "Square.hpp"
#include <vector>
#include <set>
#include <string>
int main(int argc, char *argv[])
{
    std::vector<Figure> arr;            //it will contain all the figures
    //std::vector<Figure>::iterator itArr;         
    std::set<int> elements;             //All given elements from input
    std::set<int>::iterator it;
    std::string parameters = argv[1];   //Indentifires for the figures
    int count = 0;
    //itArr = arr.begin();
    for(int i = 0; i < argc - 1; i++)
    {
        if(parameters[count] == '\0')
            std::cerr << "Some variables are missing or weren't given at all\n";
        if(parameters[count] == 'c')    //Quadrangle handling
        {
            for(int x = i; x < i + 5; x++)  //i + 5 coz quadrangle aquires 5 elements
            {
                try
                {
                    elements.insert(std::stoi(argv[i + 2]));
                }
                catch(std::invalid_argument e)
                {
                    std::cerr << e.what() << '\n';
                }
                
            }
            if(elements.size() == 2)    // It checks which shape is in elements
            {
                it = elements.find(90);
                if(it != elements.end()) //Square
                {
                    elements.erase(*it);
                    it = elements.begin();
                    Square *kw = new Square(*it);
                    arr.push_back(*kw);
                }
                else    //Rhomb
                {

                }

            }
            else    //Rectangle
            {

            }
            elements.erase(elements.begin(), elements.end());   //We erase what isn't needed

            i = i + 5;
            count++;
        }
        else if(parameters[count] == 'o')
        {

        }
        else if(parameters[count] == 'p')
        {

        }
        else if(parameters[count] == 's')
        {

        }
        else
        {
            std::cerr << "Wrong letter\n";
            return 0;
        }

    }
    delete[] &elements;
    return 0;
}
