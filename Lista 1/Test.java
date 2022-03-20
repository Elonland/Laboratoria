public class Test
{
    public static void main(String args[])
    {
        int n;
        int tab[] = new int[args.length];
        int index = 0;
        for(int i = 0; i < args.length; i++)
        {
            try
            {
                n=Integer.parseInt(args[i]);
                tab[index] = n;
                index++;
            }
            catch (NumberFormatException ex)
            {
                System.out.println(args[i] + " nie jest liczba calkowita");
            }
        }
        //Instancja klasy          v Tu jest użyty konstruktor
        LiczbyPierwsze nowy = new LiczbyPierwsze(tab[0]);

        for(int i = 1; i < args.length; i++)
            nowy.liczba(tab[0]);
        //  wywołanie metody

    }
}
