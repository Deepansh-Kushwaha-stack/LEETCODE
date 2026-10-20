
class Solution {
    public String reverseVowels(String s) {
        int n = s.length();

        int i = 0;
        int j = n - 1;

        char[] arr = s.toCharArray();

        while (i < j) {
            if (!isVowel(arr[i])) {
                i++;
            } else if (!isVowel(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }

    boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }
    }
}
