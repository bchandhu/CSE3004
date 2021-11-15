import java.math.BigInteger;
public class Fib_Effective
{
  public static void main (String[]args)
  {
    int n = 100;
      System.out.println (fib (n));
  }
  public static BigInteger fib (int n)
  {
    BigInteger a = BigInteger.valueOf (0);
    BigInteger b = BigInteger.valueOf (1);
    BigInteger c = BigInteger.valueOf (1);
    for (int i = 2; i <= n; i++)
      {
	c = a.add (b);
	a = b;
	b = c;
      } return (b);
  }
}
