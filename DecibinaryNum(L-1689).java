class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char c : n.toCharArray())
        {
            max = Math.max(max, c - '0');
        }
        return max;
    }
}

//just find the largest integer in string that will determine the steps....
