class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        Solve(0,target,candidates,ans,new ArrayList<>());
        return (ans);
    }
    public void Solve(int index,int target,int[] candidates , List < List <Integer> >ans ,List<Integer> c){
        if(target==0){
            ans.add(new ArrayList<>(c));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1])continue;
            if(candidates[i]<=target){
                c.add(candidates[i]);
                Solve(i+1,target-candidates[i],candidates,ans,c);
                c.remove(c.size()-1);
            }
        }
        
    }
}