class Solution {
    public int totalMoney(int n) {
        int result=0 , reset = 0 , toAdd = 0;
        for(int i = 0; i < n;i++)
        {
            if(i % 7 == 0){
                reset++;
                toAdd = reset;
                result += toAdd;
            }
            else{
               toAdd++;
               result += toAdd;
            }
        }
        return result;

    }
}

//Could be better {O(1)}
