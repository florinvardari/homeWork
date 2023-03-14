import java.util.Scanner;
import java.util.Stack;
import java.util.*;



public class Practice {
        public static boolean isBalanced(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }


    public static void main(String[] args) {
            ;
        System.out.println(isBalanced(")()("));


        }

    }







