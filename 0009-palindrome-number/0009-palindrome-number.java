class Solution {
    public boolean isPalindrome(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        int n = arr.length;
        int i=0;
        int j = n-1;
        while(i<=j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
}