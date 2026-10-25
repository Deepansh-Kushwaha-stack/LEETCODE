class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        // String rev = "";
        StringBuilder rev = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i].length() == 0){
                continue;
            }
            if(rev.length() == 0){
                rev.append(arr[i]);
            }else{
                rev.append(" ");
                rev.append(arr[i]);
            }
        }
        return rev.toString();
    }
}