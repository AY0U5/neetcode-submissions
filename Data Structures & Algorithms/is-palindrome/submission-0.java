class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] text = cleaned.toCharArray();
        int i = 0; 
        int j = text.length - 1;
        while(i<j){
            if (text[i] != text[j])
                return false;
            i++; j--;
        }
        return true;
    }
}
