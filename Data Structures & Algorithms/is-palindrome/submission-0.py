import re
class Solution:
    def isPalindrome(self, s: str) -> bool:
        if len(s) == 0 or len(s) == 1:
            return True
        string = re.sub(r"[^a-zA-Z0-9]", "", s)
        string = string.lower()
        left, right = 0, len(string) - 1
        while left<right:
            if string[left] != string[right]:
                return False
            else:
                left+=1
                right-=1
        
        return True
        