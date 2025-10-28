class Solution {
    public int countValidSelections(int[] nums) {
        int totalSum = 0 , result = 0;
        int leftSum = 0;
        for(int i: nums)
            totalSum += i;
        for(int i : nums)
        {
            leftSum += i;
            if(i == 0)
            {
                if(leftSum == totalSum -leftSum)
                    result += 2;
                else if(leftSum - (totalSum - leftSum) == 1 || (totalSum-leftSum) - leftSum == 1)
                    result +=1;
            }
        }
        return result;
    }
}


//space complexity could be better
