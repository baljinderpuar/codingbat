# Given a string, return a string where for every char in the original, there are two chars.

def double_char(str):
  result = ""
  for i in range(len(str)):
    result += str[i:i+1] + str[i:i+1]
  return result
