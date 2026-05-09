class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hs = new HashMap<>();
        hs.put('{', '}');
        hs.put('[', ']'); hs.put('(', ')');
        Stack<Character> stack = new Stack<>();


        for (char ch : s.toCharArray()) {
            if (hs.containsKey(ch)) {
                stack.push(hs.get(ch));
            } else if (stack.isEmpty() || stack.pop() != ch)
                return false;
        }
    return stack.isEmpty();
    }
}
