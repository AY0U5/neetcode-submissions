class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for(String str : strs){
            encoded_string += "#"+str.length()+","+str;
        }
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != ',') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i + 1, j));
            String decoded = str.substring(j + 1, j + 1 + length);
            decoded_strs.add(decoded);
            i = j + 1 + length;
        }
        return decoded_strs;
    }
}
