#include <iostream>
#include "PascalTriangle.hpp"
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
                Input[i] = 0;
            }   
        }
        
        

        PascalTriangle *Object;
        try
        {
            const int k = Input[0];
            Object = new PascalTriangle(k);//Generates the row
        }
        catch (const MyException& f)
        {
            std::cerr << f.what() << std::endl;
            return 0;
        }
        

        for(int i = 1; i < argc; i++)//Prints the values.
        {
            try
            {
                if(Input[i] == 0)
                    std::cout << argv[i] << " - invalid input" <<std::endl;   
                const int m = Input[i];
                std::cout << m << " - " << (*Object).value(m) << std::endl;   
            }
            catch (const MyException& e)
            {
                std::cerr << e.what() << std::endl;
            }
            
        }
            
}
    