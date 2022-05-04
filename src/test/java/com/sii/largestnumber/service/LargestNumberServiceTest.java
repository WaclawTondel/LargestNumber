package com.sii.largestnumber.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestNumberServiceTest {

    private LargestNumberService testService = new LargestNumberService();

    @Test
    void shouldFindLargestNumberCase1() {
        //given
        List<Integer> numbers = Arrays.asList(50, 2, 1, 9);
        String expectedNumber = "95021";

        //when
        String result = testService.findLargestNumber(numbers);

        //then
        assertEquals(expectedNumber, result);
    }

    @Test
    void shouldFindLargestNumberCase2() {
        //given
        List<Integer> numbers = Arrays.asList(420, 42, 423);
        String expectedNumber = "42423420";

        //when
        String result = testService.findLargestNumber(numbers);

        //then
        assertEquals(expectedNumber, result);
    }

    @Test
    void shouldFindLargestNumberCase3() {
        //given
        List<Integer> numbers = Arrays.asList(5, 50, 56);
        String expectedNumber = "56550";

        //when
        String result = testService.findLargestNumber(numbers);

        //then
        assertEquals(expectedNumber, result);
    }
}