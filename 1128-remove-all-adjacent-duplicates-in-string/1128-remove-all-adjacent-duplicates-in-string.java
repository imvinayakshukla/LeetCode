class Solution {
    public String removeDuplicates(String s) {
             Stack<Character> stack= new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
            
        }
        StringBuilder newString= new StringBuilder();
        while(!stack.isEmpty()){
            newString.append(stack.pop());
        }
        String result= newString.toString();

        return result;
    }
}