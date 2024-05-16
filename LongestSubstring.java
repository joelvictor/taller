package com.algorithm.pattern;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int solution(String str) {
        if (str.isEmpty())
            return 0;

        int begin = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();
        int max = 0;


        while (end < str.length()) {
            Character c  = str.charAt(end);
            if (set.contains(c)) {
                set.remove(str.charAt(begin));
                begin++;
            } else {
                set.add(c);
                max = Math.max(max, end - begin + 1);
                end++;
            }
        }

        return max;
    }


    public static void main(String[] args) {
//        System.out.println(solution("ABDEFGABEF"));
//        System.out.println(solution("BBBB"));
//        System.out.println(solution("GEEKSFORGEEKS"));
//        System.out.println(solution("pwwkew"));
        System.out.println(solution("dvdf"));
    }

}
