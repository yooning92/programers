import java.util.*;

class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        return s.chars().filter(e -> e == 'P').count() == s.chars().filter(e -> e == 'Y').count();
    }
}