class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int i : asteroids)
        {
            while(i < 0 && !stk.empty() && stk.peek() > 0)
            {
                int difference = stk.peek() + i;
                if(difference > 0)
                    i = 0;
                else if(difference < 0)
                {
                    stk.pop();
                }
                else
                {
                    stk.pop();
                    i = 0;
                }
            }
            if(i!= 0)
                stk.push(i);
        }
        int[] result = new int[stk.size()];
        int i = stk.size()-1;
        while(!stk.empty())
        {
            result[i] = stk.pop();
            i--;
        }
        return result;
    }
}

//just simulate
