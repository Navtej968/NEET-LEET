class Solution {
    public void sortColors(int[] nums) {
        int one = 0  , zero = 0 , two = 0;
        for(int i : nums)
        {
            if(i == 0)
                zero++;
            else if(i == 1)
                one++;
            else
                two++;
        }
        for(int i = 0;i<nums.length;i++)
        {
            if(zero!=0)
            {
                nums[i]=0;
                zero--;
            }
            else if(one!=0)
            {
                nums[i] = 1;
                one--;
            }
            else
                nums[i] = 2;
        }
    }
}


//simplicity works
