package com.kriscfoster.Stack;

import java.util.Stack;

/*
 * Given an expression string exp, write a program to examine whether the
 * pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
 */
public class BalancedString {

    public static boolean isBalanced(String string) {
        char[] characters = string.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : characters) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.size() < 1 || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.size() < 1 || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.size() < 1 || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("BALANCED STRING\n");

        String string1 = "()";
        System.out.println(string1 + " : " + isBalanced(string1));

        String string2 = "(";
        System.out.println(string2 + " : " + isBalanced(string2));

        String string3 = ")(";
        System.out.println(string3 + " : " + isBalanced(string3));

        String string4 = "[[";
        System.out.println(string4 + " : " + isBalanced(string4));

        String string5 = "[()]";
        System.out.println(string5 + " : " + isBalanced(string5));

        String string6 = "[({})]";
        System.out.println(string6 + " : " + isBalanced(string6));

        String string7 = "[({})](){}";
        System.out.println(string7 + " : " + isBalanced(string7));

        String string8 = "[({])]()";
        System.out.println(string8 + " : " + isBalanced(string8));
    }
}
