#include <iostream>
#include "Square.hpp"
#include <vector>
#include <set>
#include <string>

int main(int argc, char *argv[])
{
    std::vector<Figure*> arr;            //it will contain all the figures.
    std::vector<Figure*>::iterator itArr;  
    itArr = arr.begin();     
    std::set<int> elements;             //All given elements from input.
    std::set<int>::iterator it;
    std::string parameters = argv[1];   //Indentifires for the figures.
    
    int count = 0;						// count is for keeping track of the input to read the correct stuff.
    const int sizeOfParameters = parameters.length();
    for(int i = 0; i < sizeOfParameters; i++) // integer i is used for reading the parameters like cccc.
    {
        if(parameters[i] == 'c')    //Quadrangle handling.
        {
        	std::cout << "c is nice\n";
        	int chwila;
            for(int x = count; x < count + 5; x++)  //i + 5 coz quadrangle aquires 5 elements.
            {
                try
                {
                	chwila = std::stoi(argv[x + 2]);	//Wychodzimy poza tablice gdy dane sa nie pelne.
                    elements.insert(chwila); //set
                }
                catch(std::invalid_argument e)
                {
                    std::cerr << e.what() << '\n';
                }
                
            }
            std::cout << "Wypisuje tablice set" << std::endl;
            for(it = elements.begin(); it != elements.end(); it++)
				std::cout << *it << ' ';
			std::cout << std::endl; 
			
            if(elements.size() == 2)    // It checks which shape is in elements.
            {
                it = elements.find(90);
                if(it != elements.end()) //Square
                {
                    elements.erase(*it); //set
                    it = elements.begin(); //set
                    std::cout << "Bok kwadratu: " <<*it << std::endl;
                    
                    //Figure *kw = new Square(*it);
                    arr.emplace_back(new Square(*it));		//vector
                  	//delete kw;  
            	}
            	elements.erase(elements.begin(), elements.end());   //We erase what isn't needed.
            	std::cout << "Co jest w wektorze:" << std::endl;
            	for(itArr = arr.begin(); itArr != arr.end(); itArr++)
            		std::cout << (*itArr)->area() << ' ';
            	std::cout << '\n';
			}
			count = count + 5;
        }
    }
    arr.erase(arr.begin(), arr.begin() + sizeOfParameters);
    return 0;
}

