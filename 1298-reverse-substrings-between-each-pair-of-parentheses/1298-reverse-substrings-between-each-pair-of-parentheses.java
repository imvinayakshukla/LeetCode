class Solution {
    private void reversestring(int curr,int prev,char arr[]){
        while(prev<curr){
            
            char p=arr[prev];
            arr[prev]=arr[curr];
            arr[curr]=p;
            prev++;
            curr--;
        }

    }
    public String reverseParentheses(String s) {
        Stack<Integer>st=new Stack<>();
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char p=arr[i];

            if(p=='(')st.add(i);
            else if(p==')'){
                reversestring(i-1,st.peek()+1,arr);
                arr[i]='*';
                arr[st.pop()]='*';
            }
        }
        String ans="";
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='*')ans=ans+arr[i];
        }
        return ans;

    }
}