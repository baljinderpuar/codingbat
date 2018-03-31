/* Given a string of any length, return a new string where the last 2 chars, 
if present, are swapped, so "coding" yields "codign". */

public String lastTwo(String str) {
  if(str.length()<2) 
    return str;
  else {
    String first = str.substring(str.length()-2, str.length()-1);
    String second = str.substring(str.length()-1, str.length());
    return str.substring(0,str.length()-2) + second + first;
  }
}
