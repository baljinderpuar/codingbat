# Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
# are forbidden, so in that case just return 20.

def sorta_sum(a, b):
  sum = a + b
  if sum >= 10 and sum <= 19:
    return 20
  else:
    return sum
