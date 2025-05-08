package hello.programmers.lv1;

import java.time.LocalDate;

public class Q12901 {

    public static void main(String[] args) {
        Q12901 q = new Q12901();
        System.out.println(q.solution(5, 24));
    }

    public String solution(int month, int day) {
        LocalDate date = LocalDate.of(2016, month, day);
        return date.getDayOfWeek().toString().substring(0, 3);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12901
