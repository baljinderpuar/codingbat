# Given a string and a non-negative int n, return a larger string that is n copies of the original string.

def string_times(str, n):
  s = ""
  for i in range(n):
    s += str
  return s
