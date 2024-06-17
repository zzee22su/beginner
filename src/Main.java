import club99_0520_0628.Day26;
import club99_0520_0628.Day27;
import club99_0520_0628.Day28;
import club99_0520_0628.Day29;

public class Main {

    public static void main(String[] args) {

        /*
         * 26일차 문제 (https://leetcode.com/problems/shuffle-the-array/submissions/1287888823/)
         * shuffle-the-array
         */
        Day26 day26 = new Day26();
        System.out.print("26일차 결과 값 : "+day26.getResult());

        /*
         * 27일차 문제 (https://leetcode.com/problems/number-of-good-pairs/description/)
         * Number of Good Pairs
         *
         */
        Day27 day27 = new Day27();
        System.out.print("\n27일차 결과 값 : "+day27.getResult());


        /**
         * 28일차 문제 (https://leetcode.com/problems/find-words-containing-character/description/)
         * find-words-containing-character
         */
        Day28 day28 = new Day28();
        System.out.println("\n28일차 결과 값 : "+day28.getResultIndexList());

        /**
         * 29일차 문제 (https://leetcode.com/problems/count-items-matching-a-rule/description/)
         * count-items-matching-a-rule
         */
        Day29 day29 = new Day29();
        System.out.println("\n29일차 결과 값 : "+day29.getCount());
    }

}