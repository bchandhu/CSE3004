import java.util.*;
public class MaxVotes
{
  static int maxvote (int a, int A[])
  {
    int ca;
    for (int i = 1; i <= a; i++)
      {
	ca = A[i];
	int count = 0;
	for (int j = 1; j <= a; j++)
	  {
	    if (A[j] == ca)
	      count = count + 1;
	  }
	if (count > a / 2)
	  {
	    return 1;
	  }
      }
    return 0;
  }
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    System.out.println ("enter size of array");
    int n = sc.nextInt ();
    int A1[] = new int[10];
    System.out.println ("enter array");
    for (int i = 0; i < n; i++)
      {
	A1[i] = sc.nextInt ();
      } System.out.println ("output: " + maxvote (n, A1));
}}
