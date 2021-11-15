import java.util.*;
public class GCD_Naive
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter first number");
    int a = sc.nextInt ();
      System.out.println ("enter second number");
    int b = sc.nextInt ();
      System.out.println ("output:" + GCD (a, b));
  } static int GCD (int a, int b)
  {
    int best = 0;
    for (int d = 1; d <= a + b; d++)
      {
	if (a % d == 0 && b % d == 0)
	  {
	    best = d;
	  }
      }
    return best;
  }
}