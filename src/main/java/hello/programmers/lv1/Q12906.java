package hello.programmers.lv1;

import java.util.Arrays;
import java.util.Stack;

public class Q12906 {

    public static void main(String[] args) {
        Q12906 q = new Q12906();
        System.out.println(Arrays.toString(q.solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(q.solution(new int[]{4, 4, 4, 3, 3})));
    }

    public int[] solution(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int arr : array) {
            if (stack.isEmpty() || arr != stack.peek()) {
                stack.push(arr);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12906
