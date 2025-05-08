package hello.programmers.lv1;

public class Q12903 {

    public static void main(String[] args) {
        Q12903 q = new Q12903();
        System.out.println(q.solution("abcde"));
        System.out.println(q.solution("qwer"));
    }

    public String solution(String text) {
        int mid = text.length() / 2;
        return text.length() % 2 == 1 ? text.substring(mid, mid + 1) : text.substring(mid - 1, mid + 1);
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/12903
