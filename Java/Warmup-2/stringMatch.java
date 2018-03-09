/* Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings. */

public int stringMatch(String a, String b) {
    int count = 0;
    int len = Math.min(a.length(), b.length()) - 1;
    for (int i = 0; i < len; i++) {
        if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
            count++;
    }
    return count;
}
