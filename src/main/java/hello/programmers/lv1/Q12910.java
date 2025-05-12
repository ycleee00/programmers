package hello.programmers.lv1;

import java.util.Arrays;

public class Q12910 {

    public static void main(String[] args) {
        Q12910 q = new Q12910();
        System.out.println(Arrays.toString(q.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(q.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(q.solution(new int[]{3, 2, 6}, 10)));
    }

    public int[] solution(int[] array, int divisor) {
        Arrays.sort(array);
        int[] answer = Arrays.stream(array).filter(num -> num % divisor == 0).toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12910
