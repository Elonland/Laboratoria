public class MyException extends Exception
{
	String str1;
    public MyException(String msg)
    {
        str1 = msg;
    }
    public String toString()
    {
    	return(str1);
    }
}
