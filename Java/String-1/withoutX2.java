/* Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, 
and otherwise return the string unchanged. This is a little harder than it looks. */

public String withoutX2(String str) {
  if(str.equals("xx") || str.equals("x")) return ""; 
  else if(str.startsWith("xx")) return str.substring(2,str.length());
  else if(str.startsWith("x")) return str.substring(1,str.length());
  else if(str.length()>=2 && str.charAt(1) == 'x')
    return str.substring(0,1) + str.substring(2,str.length());
  else return str;
}
