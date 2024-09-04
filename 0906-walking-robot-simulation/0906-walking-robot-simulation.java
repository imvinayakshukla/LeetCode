class Solution {
    public int robotSim(int[] cmd, int[][] obs) {
    	//				 N     E     S       W
    	//int dir[][]= {{0,1},{1,0},{0,-1},{-1,0}};
    	int lstcmd[]= {0};
    	int max=0;    	
    	HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
    	for(int i=0;i<obs.length;i++) {
    		if(map.containsKey(obs[i][0])) {
    			map.get(obs[i][0]).add(obs[i][1]);
    		}else {
    			HashSet<Integer> set=new HashSet<>();
    			set.add(obs[i][1]);
    			map.put(obs[i][0], set);
    		}
    	}
    	
    	int ans=0;  	
    	int x=0;
    	int y=0;
    	for(int i=0;i<cmd.length;i++) {    		
    		if(cmd[i]==-1) {
    			lstcmd[0]++;
    			lstcmd[0]=lstcmd[0]==4?0:lstcmd[0];     			
    		}else if(cmd[i]==-2) {
    			lstcmd[0]--;
    			lstcmd[0]=lstcmd[0]<0?3:lstcmd[0];    			
    		}else { 			
    			if(lstcmd[0]==0) {    				
    				int nx=x;
    				int ny=y;
    				int t=cmd[i];    				
    				while(t-->0) {
    					if(map.containsKey(nx)) {
    						if(map.get(nx).contains(ny+1)) break;    							
    						else ny++;
    					}else ny++;   						
    				}
    				y=ny;
    			}else if(lstcmd[0]==1) {
    				int nx=x;
    				int ny=y;
    				int t=cmd[i];    				
    				while(t-->0) {
    					if(map.containsKey(nx+1)) {
    						if(map.get(nx+1).contains(ny))break;    						
    						else nx++;
    					}else nx++;
    				}
    				x=nx;    				
    			}else if(lstcmd[0]==2) {    				
    				int nx=x;
    				int ny=y;
    				int t=cmd[i];
    				while(t-->0) {
    					if(map.containsKey(nx)) {
    						if(map.get(nx).contains(ny-1)) break;    							
    						else ny--;   								
    					}else ny--;
    				}
    				y=ny;    				
    			}else {
    				int nx=x;
    				int ny=y;
    				int t=cmd[i];
    				while(t-->0) {
    					if(map.containsKey(nx-1)) {
    						if(map.get(nx-1).contains(ny)) break;    							
    						else nx--;
    					}else nx--;   						    					
    				}
    				x=nx;    				
    			}    			
    			ans=Math.max(ans, (x*x+y*y));    			
    		}
    	}
    	
    	return ans;
    }
}