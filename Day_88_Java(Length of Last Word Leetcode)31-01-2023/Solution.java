class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int count=0;
        while(n>0 && s.charAt(n-1)==' ')
            n--;
        int i=n-1;
        while(i>-1 && s.charAt(i) !=' ')
            i--;
        return n-i-1;
    }
}
