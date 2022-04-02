public class Test 
{
    public static void main(String args[])
    {
        int tabl[] = new int[args.length];
        for(int i = 0; i < args.length; i++)
        {
		  tabl[i] = Integer.parseInt(args[i]);
        }
        WierszTrojkataPascala Object =
            new WierszTrojkataPascala(tabl[0]);

        for(int i = 1; i < args.length; i++)
            System.out.println(tabl[i] + " - " + Object.wspolczynnik(tabl[i]));
    }
    
}
