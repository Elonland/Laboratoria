#include <iostream>
#include "Square.hpp"
#include "Circle.hpp"
#include "Pentagon.hpp"
#include "Hexagon.hpp"
#include "Rombus.hpp"
#include "Rectangle.hpp"
#include <vector>
#include <set>
#include <algorithm>
#include "NegativeNumber.hpp"
#include "WrongData.hpp"

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
        int chwila;
        if(parameters[i] == 'c')    //Quadrangle handling.
        {
            bool invalidArgument = false;
        	//std::cout << "c is nice\n";
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
                    invalidArgument = true;
                }
                catch(std::out_of_range f)
                {
                    std::cerr << f.what() << std::endl;
                    elements.clear();
                    arr.erase(arr.begin(), arr.begin() + sizeOfParameters);
                    return 0;
                }
                
            }
            if(invalidArgument == true)
            {
                count = count + 5;
                continue;
            }
                
            /*std::cout << "Wypisuje tablice set" << std::endl;
            for(it = elements.begin(); it != elements.end(); it++)
				std::cout << *it << ' ';
			std::cout << std::endl;*/ 
			
            if(elements.size() == 2 || elements.size() == 1)    // Square and Rombus.
            {
                it = elements.find(90);
                if(it != elements.end()) //Square
                {
                    if(elements.size() != 1)
                        elements.erase(*it); //set
                    it = elements.begin(); //set
                    try
                    {
                        arr.emplace_back(new Square(*it));  //vector 
                    }
                    catch(NegativeNumber& e)
                    {
                        std::cerr << e.what() << '\n';
                    }
                    
                    		
            	}
                else        //Rombus
                {
                    int help;
                    it = elements.begin();
                    help = *it;
                    if(elements.size() != 1)    //if i.e. 20 20 20 20 20
                    {
                        elements.erase(it);
                        it = elements.begin();
                    } 
                    try
                    {
                        arr.emplace_back(new Rombus(*it,help)); //vector 
                    }
                    catch(NegativeNumber& e)
                    {
                        std::cerr << e.what() << '\n';
                    }
                    catch(WrongData& k)
                    {
                        std::cerr << k.what() << std::endl;
                    }
                    
                }

            	/*std::cout << "Co jest w wektorze:" << std::endl;
            	for(itArr = arr.begin(); itArr != arr.end(); itArr++)
            		std::cout << (*itArr)->area() << ' ';
            	std::cout << '\n';*/
			}
            else if(elements.size() == 3)   //Rectangle
            {
                it = elements.find(90);
                if(it != elements.end())
                {
                    elements.erase(*it);

                    int help;
                    it = elements.begin();
                    help = *it;
                    elements.erase(it);
                    it = elements.begin();
                    try
                    {
                        arr.emplace_back(new Rectangle(*it,help));  //vector 
                    }
                    catch(NegativeNumber& e)
                    {
                        std::cerr << e.what() << '\n';
                    }
                }
                else
                    std::cout << "Rectangle must have 90 degres\n";

            }
            else
                std::cout << "Given sides don't match any figure\n";
			count = count + 5;
            elements.clear();   //We erase set.
        }
        else if(parameters[i] == 'o' || parameters[i] == 'p' || parameters[i] == 's')
        {
            try
            {
                chwila = std::stoi(argv[count + 2]);	//Wychodzimy poza tablice gdy dane sa nie pelne.
                elements.insert(chwila); //set
                it = elements.begin();
                if(parameters[i] == 'o')
                {
                    arr.emplace_back(new Circle(*it));
                }    
                else if(parameters[i] == 'p')
                {
                    arr.emplace_back(new Pentagon(*it));
                }
                else if(parameters[i] == 's')
                {
                    arr.emplace_back(new Hexagon(*it));
                }
            }
            catch(std::invalid_argument e)
            {
                std::cerr << e.what() << '\n';
            }
            catch(std::out_of_range f)
            {
                std::cerr << f.what() << std::endl;
                elements.clear();
                arr.erase(arr.begin(), arr.begin() + sizeOfParameters);
                return 0;
            }
            

            elements.clear();
            count++;
        }
        else
        {
            std::cout << "Wrong letter sorry (c, o, p, s)";
            return 0;
        }
    }
    for_each(arr.begin(), arr.end(),
             [](Figure* Object) { std::cout << "Area " << Object->area() << " " 
                            << "Perimeter " << Object->perimeter() <<std::endl; });

    arr.erase(arr.begin(), arr.begin() + sizeOfParameters);
    return 0;
}
