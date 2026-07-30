class Solution {
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack <Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                res = a + b;
                stack.push(res); 
            } else if(token.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                res = a - b;
                stack.push(res);
            }else if(token.equals("*")){
               int b = stack.pop();
                int a = stack.pop();
                res = a * b;
                stack.push(res);
            }else if(token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                res = a / b;
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}
