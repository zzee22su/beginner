package club99_0520_0628;

import java.util.Arrays;

public class Day30 {

    String s = "codeleet";
    int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
    String resultStr = "";

    public Day30() {
        restoreString(this.s, this.indices);
    }

    public String getResultStr() {
        return resultStr;
    }

    public String restoreString(String s, int[] indices) {
        String[] ss = new String[s.length()];
        String[] tempStr = new String[s.length()];

        // 문자열 split 없이 하는 방법
        // -> char[] chars = s.toCharArray(); -> chars에 [c, o, d, e, l, e, e, t]로 저장된다.
        ss = s.split("");

        for (int i = 0; i<indices.length; i++) {
            tempStr[indices[i]] = ss[i];
        }

        // String이 아닌 char를 이용했을 때 -> String.valueOf(chars);
        resultStr = String.join("", tempStr);

        return resultStr;
    }
}
