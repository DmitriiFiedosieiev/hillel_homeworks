package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public List<String> sortNumbers(String numbers) {
        String[] splitNumbers = numbers.split(",");
        List<String> numbersList = new ArrayList<>(Arrays.asList(splitNumbers));
        return numbersList.stream().map(Integer::parseInt).sorted().map((a) -> Integer.toString(a)).collect(Collectors.toList());
    }
}
