class Solution {
    // use map for cache
    public HashMap<Integer,Integer> mp = new HashMap<>();
    
    public int check(int num,int[] mapping){
        // map is use as cache
        if(mp.containsKey(num)){
            return mp.get(num);
        }
        // converting string for easy traversal of digit
        String s=String.valueOf(num);
        int []arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=mapping[Integer.parseInt(String.valueOf(s.charAt(i)))];
        }
        //calculation value based on mapping
        int temp=0;
        for(int n:arr){
            temp=(temp*10)+n;
        }
        mp.put(num,temp);
        return mp.get(num);
        
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<Integer> store = new ArrayList<>();
        for(int n:nums){
            store.add(n);
        }
        Collections.sort(store,(a,b)->{
            int valA=check(a,mapping);
            int valB =check(b,mapping);
            if(valA==valB){
                return 0;
            }
            return valA-valB;
        });
        int ans[]= new int[store.size()];
        for(int i=0;i<store.size();i++){
            ans[i]=store.get(i);
        }
        return ans;
    }
}