public class SitoErastotenesa
{

  void SitoErastotenesa(int range)
  {
    boolean tab[] = new boolean[range + 1];
    for(int i = 0; i <= range; i++)
      tab[i] = true;
    for(int i = 2; i*i <=  range; i++)
    {
      if(tab[i] == true)
      {
        for(int p = i*i; p <= range; p += i)
	{
	  tab[p] = false;
	}
      }
    }

    for(int i = 2; i <= range; i++)
    {
      if(tab[i] == true)
        System.out.print(i + " ");
    }
    System.out.println("");
  }


  public static void main(String args[])
  {
    int n = Integer.parseInt(args[0]);
    System.out.println("The following numbers are prime");
    SitoErastotenesa newObject = new SitoErastotenesa();
    newObject.SitoErastotenesa(n);
  }
}
