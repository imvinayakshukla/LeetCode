class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int value=s.charAt(i)-'a'+1;
            sb.append(value);
        }
        String str=sb.toString();
        int num=0;
        for(char ch:str.toCharArray()){
             num+=ch-'0';
         }
      
        for(int i=1;i<k;i++){
            int nums2=0;
          while(num!=0){
            int temp=num%10;
            nums2+=temp;
            num/=10;
          }
          num=nums2;
        }
        return num;
    }
}