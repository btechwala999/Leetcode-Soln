class Solution {
    public int[] getConcatenation(int nums[]) {
        int end = nums.length;
        int curr;
        int con[] = new int[end+end];
        for (int i = 0; i < nums.length; i++) {
            curr = nums[i];
            con[i] = curr;
        }
        for (int i = 0; i < nums.length; i++) {
            con[end+i] = nums[i];
        }
        return con;
    }
}