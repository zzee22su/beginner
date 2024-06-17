package club99_0520_0628;

import java.util.ArrayList;
import java.util.List;

public class Day29 {

    List<List<String>> items = new ArrayList<>();
    int count = 0;

    public Day29() {
        initItem();
        countMatches(this.items, "type", "phone");
    }

    private void initItem() {
        List<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");

        List<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("phone");

        List<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");

        items.add(item1);
        items.add(item2);
        items.add(item3);
    }

    public int getCount() {
        return count;
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int value = -1;

        switch (ruleKey) {
            case "type":
                value = 0;
                break;
            case "color":
                value = 1;
                break;
            case "name":
                value = 2;
                break;
            default: System.out.println("Invalid rule key");
        }

        // [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]]
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(value).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
