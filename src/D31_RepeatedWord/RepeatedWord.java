package D31_RepeatedWord;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedWord {

    public static String mostCommonWord(String book) {

        //initialize word variable and instantiate new object counterMap
        //changed to Set when realized I didn't need counter for this problem
        Set<String> counterSet = new HashSet<>();
        String mostRepeatedWord = " ";

        //initially forgot to account for capitals
        //turn book into array of words
        String[] words = book.toLowerCase().split(" ");

        //itereate through words to find most frequent word
        for (int i = 0; i < words.length; i++) {

            if (!counterSet.contains(words[i])) {
                mostRepeatedWord = words[i];
                counterSet.add(words[i]);
            } else {
                mostRepeatedWord = words[i];
                return mostRepeatedWord;
            }
        }
        return mostRepeatedWord;
    }
}
