public class WierzTrojkataPascalaLib 
{
    long tab[];
    int generateTab(int n) throws MyException 
    {                   
        if(n <= 0)
            throw new MyException("Row below 1 doesn't exist");

        tab = new long[n];
        int div;
        if(n % 2 == 0 || n == 1)  // It changes the amount of numbers that we generate.
            div = n/2;
        else
            div = n/2 + 1;

        for(int i = 0; i < div; i++)// The left part of the Pascal triangle.
        {
            tab[i] = NewtonRek(n - 1, i);
        }

        int count;
        if(n % 2 == 0)
            count = div - 1;
        else
            count = div - 2;

        int i = div;
        while(count >= 0)// The right part of the Pascal triangle.
        {
            tab[i] = tab[count];
            count--;
            i++;
        }
            
        return 0;
    }
    long NewtonRek(int n, int k)		// It isn't recursion, just too lazy to change name
    {
    	if(k == 0)
    		return 1;
    	long help = 1;
    	for(int j = 0; j <= k-1; j++)
    	{
    		help = help * (n - j);
    	}
    	long help2 = 1;
    	for(int j = 0; j < k; j++)
    	{
    		help2 = help2 * (k - j);
    	}
    	if(help2 == 0)
    		return 1;
    	return help/help2; 
    }
    /*long NewtonRek(int n, int k)
    {
        if(k == 0)
            return 1;
        else
        {
            	return (NewtonRek(n - 1, k - 1)*n)/k;
        }

    }*/
}
