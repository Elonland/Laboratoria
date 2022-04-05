#ifndef PascalTriangle_H
#define PascalTriangle_H

class PascalTriangle
{
    private:
    long int * tab;
    int a;
    public:
    PascalTriangle(int n);
    long NewtonRec(int n, int k);
    long int value(int m);
 
    ~PascalTriangle();
};

#endif
