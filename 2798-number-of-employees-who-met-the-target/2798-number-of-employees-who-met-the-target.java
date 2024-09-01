class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i< hours.length; i++){
            if(hours[i] >= target){
                count++;
            }
        }
        if(count > 0){
            return count;
        }
        else{
            return 0;    
        }
    }
}