/* Given 2 int values, return whichever value is nearest to the value 10, 
or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number. */

public int close10(int a, int b) {
  int diff1 = Math.abs(a - 10);
  int diff2 = Math.abs(b - 10);
  if(diff1 < diff2) return a;
  else if(diff2 < diff1) return b;
  else return 0;
}
