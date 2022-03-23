#pragma once

class LiczbyPierwsze
{
  public:
  int* tab;
  int n;
  
  LiczbyPierwsze(int range);
  int liczba(int m);
  
~LiczbyPierwsze();
  
 // friend std::ostream & operator<<(std::ostream & out, LiczbyPierwsze * t);
};

