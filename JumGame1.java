//time compelxity is o(n)
//sc  is o(n)
//traverse from end that is destination and check at index weather from that index can reach to destination or not.
//if yes then update destination to goodindex. if reached at start then return true.
//this problem is solved with greedy but can also  solve with o(n2) time in backtracking and dynamic programming.
public class JumGame1 {
	    public boolean canJump(int[] nums) {
	        int last = nums.length-1;
	        for(int i= nums.length-1;i>=0;i--){
	            if(nums[i]+i>=last){
	                last = i;
	            }
	        }
	        return last==0;
	    }
}
