class Solution {
    public boolean isValid(String s) {
        char [] c = s.toCharArray();
        HashMap <Character, Character> map = new HashMap <>();
        Stack <Character> stack = new Stack<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for(char element : c ){
            if(map.containsKey(element)){
                if(!stack.isEmpty() && stack.peek() == map.get(element)){
                    stack.pop();
                }else{
                    return false;
                }
                
            }else{
                stack.push(element);
            }
        }
        return stack.isEmpty();
    }
}
