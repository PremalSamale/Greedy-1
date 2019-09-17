//time complexity is o(n)
//space complexity is o(1)
//idea is to jump  when value+index is greater than previous values then jump to that index maintain counter
///return counter.
public class JumpGame2 {
	 public int jump(int[] nums) {
	        int currJump =0;
	        int nextPointer=0;
	        int counter =0;
	        for(int i=0;i<nums.length-1;i++){
	            nextPointer = i+nums[i]>nextPointer ? i+nums[i]:nextPointer;
	            if(currJump==i && i<nums.length){
	                currJump = nextPointer;
	                counter++;
	            }
	            
	        }
	        return counter;
	    }


}
