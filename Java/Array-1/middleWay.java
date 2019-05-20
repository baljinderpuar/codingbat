/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
*/

public int[] middleWay(int[] a, int[] b) {
  int firstMiddle = a[a.length/2];
  int secondMiddle = b[b.length/2];
  int[] newArray = {firstMiddle, secondMiddle};
  return newArray;
}
