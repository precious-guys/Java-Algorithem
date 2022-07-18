import java.util.Stack;

public class 올바른괄호 {
    boolean solution(String s) {
        boolean answer;

        Stack<Character> stack = new Stack<>();

        if (s.charAt(0) == ')') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && s.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        answer = stack.isEmpty();
        return answer;
    }
}
