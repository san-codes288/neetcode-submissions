class Solution {
    public boolean hasDuplicate(int[] num) {
        Arrays.sort(num);
        for(int i=0;i<num.length-1;i++){
            if(num[i]==num[i+1]){
                return true;}
        }
        return false;     
    }
}