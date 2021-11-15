import java.util.*;
class Binary_Search
{
  public static void binarySearch (int arr[], int first, int last, int key)
  {
    int mid = (first + last) / 2;
    while (first <= last)
      {
	if (arr[mid] < key)
	  {
	    first = mid + 1;
	  }
	else if (arr[mid] == key)
	  {
	    System.out.print (" " + mid);
	    break;
	  }
	else
	{
	  last = mid - 1;
	}
	mid = (first + last) / 2;
      }
    if (first > last)
      {
	System.out.print (" -1");
      }
  }
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      {
	arr[i] = sc.nextInt ();
      }
    int m = sc.nextInt ();
    int key[] = new int[m];
    for (int i = 0; i < n; i++)
      {
	key[i] = sc.nextInt ();
      } int last = n - 1;
    System.out.println ("output :");
    for (int i = 0; i < m; i++)
      {
	int k = key[i];
	binarySearch (arr, 0, last, k);
}}}
