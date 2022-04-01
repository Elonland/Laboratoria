public class WierszTrojkataPascala extends WierzTrojkataPascalaLib
{
    public WierszTrojkataPascala(int n)
    {
        generateTab(n);
    }

    long wspolczynnik(int m)
    {
        return tab[m];
    }
}