/* Given 2 strings, a and b, return a string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0). */

public String comboString(String a, String b) {
  if(a.length() > b.length()) 
    return b+a+b;
  else 
    return a+b+a;
}
