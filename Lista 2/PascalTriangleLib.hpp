#ifndef PascalTriangleLib_H_
#define PascalTriagnleLib_H_

class PascalTriangleLib
{
    protected:
        int long* tab;
    public:
        int generateTab(int n);
        long NewtonRec(int n, int k);

};

#endif