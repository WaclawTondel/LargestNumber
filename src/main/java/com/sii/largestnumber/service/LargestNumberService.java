package com.sii.largestnumber.service;

import java.util.List;
import java.util.stream.Collectors;

class LargestNumberService {
    String findLargestNumber(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n >= 0)
                .map(Object::toString)
                .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2))
                .collect(Collectors.joining());
    }
}
