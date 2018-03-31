/* Given a string of even length, return a string made of the middle two chars, 
so the string "string" yields "ri". The string length will be at least 2. */

public String middleTwo(String str) {
  if(str.length() <= 2) 
    return str;
  else {
    int middle = str.length()/2;
    return str.substring(middle-1, middle+1);
  }
}
