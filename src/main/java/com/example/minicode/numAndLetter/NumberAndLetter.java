package com.example.minicode.numAndLetter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberAndLetter {
    public List<String> letterCombinations(Integer[] digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length == 0) {
            return result;
        }

        Map<Integer, String[]> map = new HashMap<>();
        map.put(0, new String[]{""});
        map.put(1, new String[]{""});
        map.put(2, new String[]{"a", "b", "c"});
        map.put(3, new String[]{"d", "e", "f"});
        map.put(4, new String[]{"g", "h", "i"});
        map.put(5, new String[]{"j", "k", "l"});
        map.put(6, new String[]{"m", "n", "o"});
        map.put(7, new String[]{"p", "q", "r", "s"});
        map.put(8, new String[]{"t", "u", "v"});
        map.put(9, new String[]{"w", "x", "y", "z"});

        String[] strings = new String[digits.length];
        appendLetter(map, digits, strings, 0, result);
        return result;
    }

    private void appendLetter(Map<Integer, String[]> map, Integer[] digits, String[] strings, int index, List<String> result) {
        if (index == digits.length) {
            result.add(String.join("", strings));
            return;
        }

        Integer integer = digits[index];
        String[] letterArray = map.get(integer);
        for (int i = 0; i < letterArray.length; i++) {
            strings[index] = letterArray[i];
            appendLetter(map, digits, strings, index + 1, result);
        }
    }

}
