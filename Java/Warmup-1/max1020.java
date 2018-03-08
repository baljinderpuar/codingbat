/* Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
or return 0 if neither is in that range. */

public int max1020(int a, int b) {
  int large = 0;
  if(a >= 10 && a <= 20) 
    large = a;
  if(b >= 10 && b <= 20 && b > large)
    return b;
  return large;
}

