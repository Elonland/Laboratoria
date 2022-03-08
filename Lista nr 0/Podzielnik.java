public class Podzielnik
{
  public static void main(String[] args)
  {
    boolean zgodne;
    int n = 0;
    int dlugosc = args.length;
    for(int i = 0; i < dlugosc; i++)
    {
      zgodne = true;
      try
      {
        n = Integer.parseInt(args[i]);
      }
      catch (NumberFormatException ex)
      {
        System.out.println(args[i] + " nie jest liczba calkowita");
        zgodne = false;
      }
      if(zgodne == true)
        System.out.println(n + " jej podzielnik " + div(n));
    }
  }
  public static int div(int n)
  {
    int pomoc = 2;
    int dzielnik = 1;
    while(pomoc <= n/2)
    {
      if(n % pomoc == 0)
        dzielnik = pomoc;
      pomoc++;
    }
    return dzielnik;
  }
}
