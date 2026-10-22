class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = i+1;
        while(j<n){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }else{
                j++;
            }
        }
        return i+1;
    }
}