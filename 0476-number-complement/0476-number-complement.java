class Solution {
    public int findComplement(int num) {
        StringBuilder stringBuilder = new StringBuilder();
		
		while(num>0) {
			stringBuilder.append(num%2);
			num/=2;
		}
		
		int answer = 0; 
		for(int i=0, index=0;i<stringBuilder.length();i++,index++) 
			if(stringBuilder.charAt(i)=='0')
				answer+= Math.pow(2, index);		
		
		return answer;
    }
}