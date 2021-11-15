import java.util.*;
public class GCD_Effective
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter first number");
    int a = sc.nextInt ();
      System.out.println ("enter second number");
    int b = sc.nextInt ();
      System.out.println ("output:" + euclidGCD (a, b));
  } static int euclidGCD (int a, int b)
  {
    if (b == 0)
      {
	return a;
      }
    int a1;
    a1 = a % b;
    return euclidGCD (b, a1);
  }
}