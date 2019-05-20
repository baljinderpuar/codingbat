/* Given an array of ints of even length, 
return a new array length 2 containing the middle two elements from the original array. 
The original array will be length 2 or more. */

public int[] makeMiddle(int[] nums) {
  int first = nums[nums.length/2-1];
  int last = nums[nums.length/2];
  int[] myArray = {first, last};
  return myArray;
}
