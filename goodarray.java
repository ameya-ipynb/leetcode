class Solution {
    public boolean isGood(int[] nums) {
        if(nums.length==1)
        return(false);
        int t=0; //temp var
        //bubble sort
        for (int i = 0; i< nums.length-1; i++)
        {
            for( int j = 0; j<nums.length-i-1; j++)
            { 
                if(nums[j] > nums[j+1])
            {
                t = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = t;            
            }

            }
        }
        //checking if all no.s come only once except for 'n'
        int n = nums.length;
        for(int i = 0; i<n-2; i++)
        {
            if(nums[i]==i+1)
            continue;
            else
            return(false);
        }
        if (nums[n-2] == nums[n-1] && nums[n-1]==n-1)
        return(true);
        else
        return(false);
    }
}
