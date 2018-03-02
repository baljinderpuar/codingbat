/* Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive). */

public String missingChar(String str, int n) {
  String front = str.substring(0, n);
  String back = str.substring(n+1, str.length() );
  return front + back;
}
