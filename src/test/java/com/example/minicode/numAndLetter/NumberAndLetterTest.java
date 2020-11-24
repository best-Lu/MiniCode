package com.example.minicode.numAndLetter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NumberAndLetterTest {

    @Autowired
    NumberAndLetter numberAndLetter;

    @Test
    public void letterCombinations() {
        //
        List<String> strings = numberAndLetter.letterCombinations(new Integer[]{9});
        System.out.println(strings);
    }
}