/* Return true if the given string contains between 1 and 3 'e' chars. */

public boolean stringE(String str) {
  int cnt = 0;
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i) == 'e') cnt++;
  }
  return cnt >= 1 && cnt <= 3;
}
