class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String rev = "";
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i].length() == 0){
                continue;
            }
            if(rev.length() == 0){
                rev += arr[i];
            }else{
                rev += " " + arr[i];
            }
        }
        return rev;
    }
}