class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        return false;

        if(s.compareTo(goal)==0)
            return true;

        return (s+s).indexOf(goal)>=1;
        
    }
}