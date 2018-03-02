# Return the number of times that the string "code" appears anywhere in the given string, 
# except we'll accept any letter for the 'd', so "cope" and "cooe" count.

def count_code(str):
  count = 0
  for i in range(len(str)):
    if str[i-2:i] == "co" and str[i+1:i+2] == "e":
      count += 1
  return count
