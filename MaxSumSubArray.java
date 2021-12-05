package dynamicProgramming;

public class MaxSumSubArray {

    public static int maxSubArray(int[] nums) {
        
    	int[]sol = new int[nums.length];
    	int max =nums[0];
    	sol[0]=nums[0];
    	for(int i=1;i<nums.length;++i)
    	{
    		sol[i] = sol[i-1]>0?sol[i-1]+nums[i]:nums[i];
    		max = Math.max(max, sol[i]);
    	}
    	return max;
    }
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		int[] h= new int[] {5,4,-1,7,8};
		System.out.println(maxSubArray(h));
	}

}
