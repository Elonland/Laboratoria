public class LiczbyPierwsze
{
	//Pole
	private static int[] tab;

	//Konstruktor tworzy tablicę w zakresie 2 do n
	LiczbyPierwsze(int n)
	{
		tab = new int[n-2];
		boolean isPrime;
		int testNumber = 2;
		int index = 0;

		for(int num = 2; num <= n; num++) //Liczby do sprawdzenia
		{
			isPrime = true;
			while(isPrime == true || testNumber < Math.sqrt(num))
			{
				if(num % testNumber == 0 && testNumber != num)
				{
					isPrime = false;
					break;
				}

				testNumber++;
			}
			if(isPrime == true)
			{
				tab[index] = num;
			}
			index++;
		}
			
	}
	
	//Metoda zwraca wartość m-tej liczby pierwszej z tego zakresu
	public int liczba(int m)
	{
		System.out.println(tab[m]);
		return 0;
	}
}