#include <iostream>
#include "PascalTriangle.hpp"
//#include "MyException.hpp"
#include <string>
int main(int argc, char *argv[])
{
    int* Input = new int[argc];
    for(int i = 0; i < argc; i++)
    {
    	try
        {
        	Input[i] = std::stoi(argv[i]);
        }
        catch( std::invalid_argument e)
        {
        	Input[i] = -1;
        }   
    }
        
    PascalTriangle *Object;
    
        const int k = Input[0];
        Object = new PascalTriangle(k);//Generates the row
    
    /*catch(MyException& e)
	{
		std::cout << "Row below 1 doesn't exist" << std::endl;
	}*/
        

    for(int i = 1; i < argc; i++)//Prints the values.
    {
    	const int m = Input[i];
    	
        if(Input[i] == -1)
          std::cout << argv[i] << " - invalid input" <<std::endl;
		else
		{
            std::cout << m << " - " << Object->value(m) << std::endl;
		}   
                   
        
       	/*catch(MyException& f)
		{
			std::cout << m << " - invalid range" << std::endl;
		}*/
		
		
            
    }
    delete Object;
	delete[] Input;
            
}
    
