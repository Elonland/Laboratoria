#ifndef WrongData_H
#define WrongData_H
#include <iostream>
class WrongData : public std::exception
{
	public:
	const char *what() const noexcept
	{
		return "Size of the sides is wrong";
	}
	
};
#endif