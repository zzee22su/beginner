package club99_0520_0628;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day28 {

    String[] words = {"leet","code"};
    char x = 'e';
    List<Integer> resultIndexList = new ArrayList<>();

    public Day28() {
        findWordsContaining(this.words, this.x);
    }

    public String getResultIndexList() {
        return resultIndexList.toString();
    }

    public List<Integer> findWordsContaining(String[] words, char x) {

        for (int i = 0; i < words.length; i++) {
            String[] temp = new String[words[i].length()];
            temp = words[i].split("");

            for (int j = 0; j < temp.length; j++) {
                if (temp[j].equals(String.valueOf(x))) {
                    resultIndexList.add(i);
                    break;
                }
            }
        }
        return resultIndexList;
    }
}
