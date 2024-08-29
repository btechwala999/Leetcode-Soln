class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i < words.length; i++){
            String c = words[i];
            for(int j = 0; j < c.length(); j++){
                if(c.charAt(j) == x){
                    l.add(i);
                    break;
                }
            }
        }
        return l;
    }
}