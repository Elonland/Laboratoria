public class WierzTrojkataPascalaLib 
{
    long tab[];
    int generateTab(int n)//explicite n <= 0
    {
        tab = new long[n];
        tab[0] = n; 
        for(int i = 0; i <= n; i++)
        {
            tab[i] = wspolczynnikRek(n, i);
        }
            
        return 0;
    }
    long wspolczynnikRek(long n, long k)//explicite k > n
    {
        if(k == 0)
            return 1;
        else
        {
            return (wspolczynnikRek(n - 1, k - 1)*n)/k;
        }

    }
}
