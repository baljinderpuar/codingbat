/* Given three int values, a b c, return the largest. */

public int intMax(int a, int b, int c) {
  int large = 0;
  if(a > b && a > c) large = a;
  else if(b > c && b > a) large = b;
  else if(c > a && c > b) large = c;
  return large;
}
