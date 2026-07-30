class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> res = new HashMap<>();
        for(String word: strs){
            int [] count = new int[26]; //Create an array of size 26 to count each letter's frequency (from 'a' to 'z') in the current string.
            for(char c : word.toCharArray()){ //Convert the string to a char array and count each letter.
                count[c-'a']++; //'c' - 'a' maps letters to indices: //a' → 0, //'b' → 1, ..., 'z' → 25.
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>()); //if the key isn´t already in the map, insert a new empty list.

            res.get(key).add(word);//Add the current string to the correct group in the map

        }
        return new ArrayList<>(res.values()); //return all anagram groups as a list of lists.
    }
}
