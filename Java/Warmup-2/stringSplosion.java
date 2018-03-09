/* Given a non-empty string like "Code" return a string like "CCoCodCode". */

public String stringSplosion(String str) {
  String myString = "";
  for(int i=0; i<str.length(); i++){
    myString += str.substring(0, i+1);
  }
  return myString;
}
