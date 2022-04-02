public class WierzTrojkataPascalaLib 
{
    long tab[];
    int generateTab(int n)//explicite n <= 0 na razie nie dziala dla n = 1
    {
        tab = new long[n];
        for(int i = 0; i <= n/2; i++)
        {
            tab[i] = wspolczynnikRek(n - 1, i);
        }
        int count = 0;
        for(int i = n/2 + 1; i < n; i++)//Nie sprawdzawlem czy to dopisywanie ma sens
        {
            tab[i] = tab[count]
            count++;
        }
            
        return 0;
    }
    long wspolczynnikRek(int n, int k)//explicite k > n
    {
        if(k == 0)
            return 1;
        else
        {
            	return (wspolczynnikRek(n - 1, k - 1)*n)/k;
        }

    }
}
