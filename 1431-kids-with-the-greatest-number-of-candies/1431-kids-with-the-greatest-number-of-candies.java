class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int greatest_ele = 0;
        for(int i = 0;i < candies.length;i++){
            greatest_ele = Math.max(greatest_ele,candies[i]);
        }
        for(int i = 0; i< candies.length; i++){
            int c = candies[i] + extraCandies;
            if(c >= greatest_ele){
                result.add(i,true);
            }
            else{
                result.add(i,false);
            }
        }
        return result;
    }
}