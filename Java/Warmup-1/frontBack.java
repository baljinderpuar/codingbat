/* Given a string, return a new string where the first and last chars have been exchanged. */

public String frontBack(String str) {
  if(str.length() >= 2){
    String first = str.substring(0,1);
    String last = str.substring(str.length() - 1, str.length());
    return last + str.substring(1, str.length() - 1) + first;
  } else {
    return str;
  }
}
