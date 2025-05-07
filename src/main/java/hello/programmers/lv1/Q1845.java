package hello.programmers.lv1;

import java.util.HashSet;
import java.util.Set;

public class Q1845 {

    public static void main(String[] args) {
        Q1845 q = new Q1845();
        System.out.println(q.solution(new int[]{3, 1, 2, 3}));
        System.out.println(q.solution(new int[]{3, 3, 3, 2, 2, 4}));
    }

    public int solution(int[] pokemons) {
        int selectPossibleNum = pokemons.length / 2;
        Set<Integer> uniquePokemonSet = new HashSet<>();
        for (int pokemon : pokemons) {
            uniquePokemonSet.add(pokemon);
            if (uniquePokemonSet.size() == selectPossibleNum) {
                break;
            }
        }
        return uniquePokemonSet.size();
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
