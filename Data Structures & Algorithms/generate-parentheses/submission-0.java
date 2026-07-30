class Solution {
    private void backtrack(int openN,int closedN,int n, List<String> res, StringBuilder stack) {
        //
        if(openN == closedN && openN == n){
            //When a combination of parentheses is made using the stack, add it to the res arrayList
            res.add(stack.toString());
            return;
        }

        if(openN<n){
            stack.append('(');
            backtrack(openN+1,closedN, n, res, stack);
            stack.deleteCharAt(stack.length()-1); //Once a opening parentheses is added we pop it from the stack
        }
        if(closedN < openN){
            stack.append(')');
            backtrack(openN,closedN+1,n,res,stack);
            stack.deleteCharAt(stack.length()-1); //Once a closing parentheses is added we pop it from the stack
        }
    

    }
    public List<String> generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0,0,n,res,stack);
        return res;
    }
}
