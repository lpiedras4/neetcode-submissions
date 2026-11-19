class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        buckets = [[] for i in range(len(nums) + 1)]
        for num in nums:
            count[num] = count.get(num,0) + 1
    
        for num, cnt in count.items():
            buckets[cnt].append(num)
        
        top_k = []
        for i in range(len(buckets) - 1, 0 , -1):
            for num in buckets[i]:
                top_k.append(num)
                if len(top_k) == k:
                    return top_k
        