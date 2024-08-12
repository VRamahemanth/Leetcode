class Solution {
    public int lengthOfLastWord(String s) {
        String[] new_arr=s.split(" ");
        String s1= new_arr[new_arr.length-1];
        return s1.length();
        
    }
}