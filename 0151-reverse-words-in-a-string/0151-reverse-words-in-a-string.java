class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        int start = 0, end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        int i = 0;
        int l = 0, r = 0;
        int n = arr.length;

        while (i < n) {
            while (i < n && arr[i] != ' ') {
                arr[r++] = arr[i++];
            }

            if (l < r) {
                start = l;
                end = r - 1;

                while (start < end) {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }

                if (r < n) {
                    arr[r++] = ' ';
                }

                l = r;
            }

            i++;
        }

        return new String(arr, 0, r > 0 && arr[r - 1] == ' ' ? r - 1 : r);
    }
}