/* Given a string, return a version without the first 2 chars. 
Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
The string may be any length. Harder than it looks. */

public String deFront(String str) {    
  if(str.length()>=2) {
    if(str.startsWith("a") && str.substring(1,2).equals("b"))
      return str;
    else if(str.startsWith("a")) 
      return "a" + str.substring(2,str.length());
    else if(str.substring(1,2).equals("b")) 
      return str.substring(1,str.length());
    else 
      return str.substring(2,str.length());
  } 
  else {
    if(str.startsWith("a")) 
      return str;
    else 
      return "";
  }
}

