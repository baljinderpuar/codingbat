/* Given a string, if a length 2 substring appears at both its beginning and end, 
return a string without the substring at the beginning, so "HelloHe" yields "lloHe". 
The substring may overlap with itself, so "Hi" yields "". Otherwise, 
return the original string unchanged. */

public String without2(String str) {
  if(str.length()<2) 
    return str;
  else if(str.startsWith(str.substring(str.length()-2, str.length())))
    return str.substring(2,str.length());
  else 
    return str;
}
