public class WierszTrojkataPascala extends WierzTrojkataPascalaLib
{
    int a;
    public WierszTrojkataPascala(int n) throws MyException
    {
        a = n;
        generateTab(n);
    }

    long wspolczynnik(int m) throws MyException
    {
        if(m < 0 || m >= a)
            throw new MyException(m + " - invalid range");
            return tab[m];  
    }
}