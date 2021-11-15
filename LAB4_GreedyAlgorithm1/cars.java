import java.util.*;
import java.io.*;
public class cars
{
  static int compute_refills (int dist, int tank, int stops[], int n)
  {
    int current_refills = 0;
    int num_refills = 0;
    int last_refill = 0;
    while (current_refills <= n)
      {
	last_refill = current_refills;
	while ((current_refills <= n)
	       && (stops[current_refills + 1] - stops[last_refill]) <= tank)
	  {
	    current_refills = current_refills + 1;
	  }
	if (current_refills == last_refill)
	  return -1;
	if (current_refills <= n)
	  num_refills = num_refills + 1 + 1;
      }
    return num_refills;
  }
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);
    int dist = scanner.nextInt ();
    int tank = scanner.nextInt ();
    int n = scanner.nextInt ();
    int stops[] = new int[n * n * n];
    for (int i = 0; i < n; i++)
      {
	stops[i] = scanner.nextInt ();
      } System.out.println (compute_refills (dist, tank, stops, n));
}}