# Makefile

all: main

main: Test.o MyException.o PascalTriangle.o PascalTriangleLib.o 
	clang++ -Weverything -pedantic -std=c++17 Test.c -o Test.out Test.o MyException.o PascalTriangle.o PascalTriangleLib.o

main.o: Test.cpp
	clang++ -Weverything -pedantic -std=c++17 -c Test.cpp

MyException.o: MyException.cpp
	clang++ -Weverything -pedantic -std=c++17 -c MyException.cpp

PascalTriangle.o: PascalTriangle.cpp
	clang++ -Weverything -pedantic -std=c++17 -c PascalTriangle.cpp

PascalTriangleLib.o: PascalTriangleLib.cpp
	clang++ -Weverything -pedantic -std=c++17 -c PascalTriangleLib.cpp


clean:
	rm -f main *.o *~
