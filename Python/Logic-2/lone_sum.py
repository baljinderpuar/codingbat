# Given 3 int values, a b c, return their sum. 
# However, if one of the values is the same as another of the values, 
# it does not count towards the sum.

def lone_sum(a, b, c):
  if a == b:
    return 0 if a == c else  c 
  elif b == c:
    return a
  elif a == c:
    return b
  else:
    return a + b + c
    
