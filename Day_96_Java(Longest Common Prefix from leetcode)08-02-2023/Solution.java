class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){ //if prefix not found fully it returns -1 then it goes down and cut the last letter
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
