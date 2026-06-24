public class Solution{
    public boolean  isAnagram(String s , String t){
        HashMap<Character,Integer>map= new HashMap<>();
        HashMap<Character,Integer>map_2= new HashMap<>();
        for(int i=0;i<s.length();i++){
             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i=0;i<t.length();i++){
            map_2.put(t.charAt(i), map_2.getOrDefault(t.charAt(i), 0) + 1);
        }
      if(map.equals(map_2)){
        return true;
      } else{
        return false;
      }
    }}