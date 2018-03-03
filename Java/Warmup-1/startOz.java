/* Given a string, return a string made of the first 2 chars (if present), 
however include first char only if it is 'o' and include the second only if it is 'z', 
so "ozymandias" yields "oz". */

public String startOz(String str) {
  if(str.length()>=2){
    String first = "";
    if(str.substring(0,1).equals("o")){
      first += str.substring(0,1);
    }
    if(str.substring(1,2).equals("z")){
      first += str.substring(1,2);
    }
    return first;
  }
  return str;
}
