import java.util.*;
public class MoneyChange
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("rupees");
    int r = sc.nextInt ();
    int count = 0;
    while (r >= 10)
      {
	r = r - 10;
	count++;
      }
    while (r >= 5)
      {
	r = r - 5;
	count++;
      }
    while (r >= 1)
      {
	r = r - 1;
	count++;
      }
    System.out.println (+count);
  }
}
