class Solution {
    public boolean hasDuplicate(int[] num) {
        HashSet<Integer>set= new HashSet<>();
        for(int i=0;i<num.length;i++){
            if(set.contains(num[i]))
                return true ;
            
            set.add(num[i]);
        }
        return false;
    }
}