import java.util.*;
public class maxrev
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter n");
    int n = sc.nextInt ();
      System.out.println ("enter first series of n numbers");
    int a[] = new int[n];
    int b[] = new int[n];
    for (int i = 0; i < n; i++)
      {
	a[i] = sc.nextInt ();
      } System.out.println ("enter 2nd series of n numbers");
    for (int j = 0; j < n; j++)
      {
	b[j] = sc.nextInt ();
      } int res = 0;
    Arrays.sort (a);
    Arrays.sort (b);
    for (int i = 0; i < n; i++)
      {
	res = res + (a[i] * b[i]);
      } System.out.println ("output :" + res);
}}