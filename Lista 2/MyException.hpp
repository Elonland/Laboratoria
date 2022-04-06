#ifndef MyException_H
#define MyException_H
#include <iostream>
class MyException : public std::exception
{
	
	public:
	const char *what() const noexcept
	{
		return "";
	}
	
};
#endif
