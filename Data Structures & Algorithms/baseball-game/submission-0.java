class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        for (String op : operations) {
            switch (op) {
                case "+":
                    int lastNo = stack.pop();
                    int newScore = stack.peek() + lastNo;
                    stack.push(lastNo);
                    stack.push(newScore);
                    total += newScore;
                    break;
                case "D":
                    int doubleVal = stack.peek() * 2;
                    stack.push(doubleVal);
                    total += doubleVal;
                    break;
                case "C":
                    int n = stack.pop();
                    total -= n;
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    total += Integer.parseInt(op);
            }
        }

        return total;
    }
}