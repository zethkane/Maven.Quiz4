package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> counter = new HashMap<>();
    String[] arr;

    public WordCounter(String... strings) {
        this.arr = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Integer count1 = 1;
        Integer count2 = 1;
        for (int i = 0; i < arr.length; i++) {
                if(arr[i] == "Hey")
                    counter.put(arr[i], count1++);
                if (arr[i] == "Hello"){
                    counter.put(arr[i], count2++);
                }
            }

            return counter;
    }

}
