class Solution:
    def isValid(self, s: str) -> bool:
        # Walkthrough
        """
        if string is empty, return False
        1. Create hashmap with key -> closing bracket, value -> opening bracket for each bracket type
        2. Create empty stack 
        3. How traversal will work?
            If current parentheses is in hashmap -> add to stack
            If closing bracket corresponds to a current bracket -> pop the top of the stack 
            Return empty stack, True if we cleared all the parentheses, False if we are missing one
        """
        closeToOpen = {")":"(", "}":"{","]":"["}
        stack = []


        if not s:
            return False
        for p in s:
            if p in closeToOpen:
                if stack and stack[-1] == closeToOpen[p]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(p)
        return len(stack) == 0