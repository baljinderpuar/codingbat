# Return the sum of the numbers in the array, returning 0 for an empty array. 
# Except the number 13 is very unlucky, so it does not count 
# and numbers that come immediately after a 13 also do not count.

def sum13(nums):
  total = 0
  skip = False
  if len(nums) == 0:
    return 0
  else:
    for i in range(len(nums)):
      if nums[i] == 13:
        skip = True
      elif skip:
        skip = False
      else:
        total += nums[i]
  return total
  
