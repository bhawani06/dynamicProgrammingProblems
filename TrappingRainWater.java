package dynamicProgramming;

public class TrappingRainWater {

	 public static int trap(int[] height) {
	        int rm[] = new int[height.length];
	        int rmax = Integer.MIN_VALUE;
	        for(int i =height.length-1;i>=0;--i)
	        {
	        	rmax = Math.max(rmax, height[i]);
	        	rm[i]=rmax;
	        }
	        int ans = 0,lm=Integer.MIN_VALUE;
	        for(int i=1;i<height.length;++i)
	        {
	        	lm= Math.max(lm,height[i-1]);
	        	int waterAti= Math.min(lm, rm[i])-height[i];
	        	ans+=waterAti>0 ?waterAti:0;
	        }
	        
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] h= new int[] {4,2,0,3,2,5};
		System.out.println(trap(h));
		
	}

}
