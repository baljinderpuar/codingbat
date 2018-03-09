/* Given a string, return a version where all the "x" have been removed. 
Except an "x" at the very start or end should not be removed. */

public String stringX(String str) {
  String front ="", end="";
  for(int i=0; i<str.length(); i++){
    if((str.charAt(i) != 'x') || (i == str.length()-1) || (i == 0) ){
      front += str.charAt(i);
    }
  }
  return front;
}
