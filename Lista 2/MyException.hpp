#ifndef MyException_H_
#define MyException_H_
#include <iostream>

class MyException : public std::runtime_error
{
    public:
    MyException(const std::string& msg) noexcept(true)
     : std::runtime_error(msg.c_str())
    {

    }
};

#endif