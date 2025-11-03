class Solution {
    public int minCost(String colors, int[] neededTime) {
        int left = 0 , result = 0;
        for(int r = 1 ; r < colors.length() ; r++)
        {
            if(colors.charAt(left) == colors.charAt(r))
            {
                if(neededTime[left] < neededTime[r])
                {
                    result += neededTime[left];
                    left = r;
                }
                else
                {
                    result += neededTime[r];
                }
                    
            }
            else
            {
                left = r;
            }
        }
        return result;
    }
}


//DOES STUFF
