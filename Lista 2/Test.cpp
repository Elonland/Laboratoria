#include <iostream>
#include "PascalTriangle.hpp"
//#include "MyException.hpp"
#include <string>
int main(int argc, char *argv[])
{
    int* Input = new int[argc];//Pamietaj argc pobiera rowniez ./
    for(int i = 0; i < argc - 1; i++)
    {
    	try
        {
        	Input[i] = std::stoi(argv[i + 1]);
        }
        catch( std::invalid_argument e)
        {
        	Input[i] = -1;
        }   
    }
    
    const int k = Input[0];
    if(k <= 0)
    {
    	//std::cout << Input[0] << std::endl;
        std::cout << "Row below 1 doesn't exist" << std::endl;
        delete[] Input;
        return 0;
    }
    PascalTriangle *Object;
    Object = new PascalTriangle(k);//Generates the row
    
    /*catch(MyException& e)
	{
		std::cout << "Row below 1 doesn't exist" << std::endl;
	}*/
        

    for(int i = 1; i < argc - 1; i++)//Prints the values.
    {
    	const int m = Input[i];
    	
        if(Input[i] == -1)
          std::cout << argv[i + 1] << " - invalid input" <<std::endl;
		else
		{
            Object->value(m);
		}   
                   
        
       	/*catch(MyException& f)
		{
			std::cout << m << " - invalid range" << std::endl;
		}*/
		
		
            
    }
    delete Object;
	delete[] Input;
            
}
    
