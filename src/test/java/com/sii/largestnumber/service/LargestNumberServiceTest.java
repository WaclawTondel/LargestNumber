package com.sii.largestnumber.service;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class LargestNumberServiceTest {

    private LargestNumberService testService = new LargestNumberService();

    @Test
    public void shouldFindLargestNumberCase1() {
        //given
        List<Integer> numbers = Arrays.asList(50, 2, 1, 9);
        String expectedNumber = "95021";

        //when
        String result = testService.findLargestNumber(numbers);

        //then
        assertEquals(expectedNumber, result);
    }

    @Test
    public void shouldFindLargestNumberCase2() {
        //given
        List<Integer> numbers = Arrays.asList(420, 42, 423);
        String expectedNumber = "42423420";

        //when
        String result = testService.findLargestNumber(numbers);

        //then
        assertEquals(expectedNumber, result);
    }

    @Test
    public void shouldFindLargestNumberCase3() {
        //given
        List<Integer> numbers = Arrays.asList(5, 50, 56);
        String expectedNumber = "56550";

        //when
        String result = testService.findLargestNumber(numbers);

        //then
        assertEquals(expectedNumber, result);
    }

    @Test
    public void shouldFilterNegativeNumbers() {
        //given
        List<Integer> numbers = Arrays.asList(5, -3, 50, 56, -2);
        String expectedNumber = "56550";

        //when
        String result = testService.findLargestNumber(numbers);

        //then
        assertEquals(expectedNumber, result);
    }
}