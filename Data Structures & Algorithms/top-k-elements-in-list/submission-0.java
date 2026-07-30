class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();

    for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
    }
       List <int []> arr = new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arr.add(new int[] {entry.getValue(),entry.getKey()}); //Adds the element and its ocurrence to the arrayList
       }

        arr.sort((a,b) -> b[0] - a[0]); //orders each element in decending order

        int [] res = new int[k]; //New "result" array of size k

        for(int i=0;i<k;i++){
            res[i] = arr.get(i)[1]; //replaces the null value of the array res with the defined k elements
        }

        return res;






          
    }
}
