/*#ifndef MyException_H
#define MyException_H
#include <iostream>
class MyException : public std::exception
{
	
	public:
	const char *what() const noexcept;
	
	/*private:
	string message;
    public:
 	MyException(const std::string& message) noexcept(true)
 	: std::runtime_error (message.c_str())
 	{
 	}
};

MyException::MyException(const std::string message) noexcept(true)
{
}

const char* MyException::what() const noexcept(true)
{
	return message.c_str();
}
#endif*/
