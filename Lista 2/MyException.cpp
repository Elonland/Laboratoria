#include "MyException.hpp"
#include <iostream>

MyException::MyException(const std::string& msg)
: std::runtime_error(msg.c_str())
{
}