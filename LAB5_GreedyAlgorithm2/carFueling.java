import java.util.Scanner;
public class carFueling
{
  static int carrefuling (int distance, int tank, int stops[], int n)
  {
    int currentrefills = 0;
    int numrefills = 0;
    int lastrefills = 0;
    while (currentrefills <= n - 1)
      {
	lastrefills = currentrefills;
	while ((currentrefills <= n - 1)
	       && stops[currentrefills + 1] - stops[lastrefills] <= tank)
	  {
	    currentrefills = currentrefills + 1;
	  }
	if (currentrefills == lastrefills)
	  return -1;
	if (currentrefills <= n)
	  numrefills = numrefills + 1;
      }
    System.out.println ("Possible");
    return numrefills;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int distance = sc.nextInt ();
    int tank = sc.nextInt ();
    int n = sc.nextInt ();
    int stops[] = new int[n * n * n];
    for (int i = 0; i < n; i++)
      {
	stops[i] = sc.nextInt ();
      } System.out.println (carrefuling (distance, tank, stops, n));
    tank = distance - stops[3];
    System.out.println ("The extra distance is :-" + tank);
}}
