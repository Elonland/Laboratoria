#ifndef MyException_H
#define MyException_H
#include <iostream>

class MyException : public std::runtime_error
{
    public:
    MyException(const std::string& msg)
     : std::runtime_error(msg.c_str())
    {
	std::cout << msg.c_str() << std::endl;
    }
};

#endif
