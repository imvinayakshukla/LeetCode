class Solution {
    public int minimumDeletions(String s) {
         int n=s.length() ;
       int count =0 ;
       Stack<Character> st= new Stack<>() ;
       for(int i=0; i<n; i++){
         if(!st.isEmpty() && st.peek()=='b' && s.charAt(i)=='a' ){
             count++ ;
             st.pop() ;
         }
         else{
            st.push(s.charAt(i)) ;
         }
       }
       return count ;
    }
}