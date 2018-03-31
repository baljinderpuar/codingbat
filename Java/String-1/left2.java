/* Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
The string length will be at least 2. */

public String left2(String str) {
  if(str.length()<=2) 
    return str;
  else 
    return str.substring(2,str.length()) + str.substring(0,2);
}
