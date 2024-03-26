package infy;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>
                (Arrays.asList("ot", "cat", "dog", "cat", "tom", "god", "ogd"));

        Set<Set<String>> set = new HashSet<>();

        Collections.sort(arr);
        System.out.println(arr);

        for (int i = 0; i < arr.size() - 1; i = i + 2) {
            Set<String> setTemp = new HashSet<>();
            if (arr.get(i) == arr.get(i + 1))
                setTemp.add(arr.get(i));
            else {
                char[] c1 = (arr.get(i)).toCharArray();
                char[] c2 = (arr.get(i + 1)).toCharArray();
                if (c1.length == c2.length) {
                    Arrays.sort(c1);
                    Arrays.sort(c2);
                    if (Arrays.equals(c1, c2)) {
                        setTemp.add(arr.get(i));
                        setTemp.add(arr.get(i + 1));
                    }

                }
            }
            if (!setTemp.isEmpty())
                set.add(setTemp);
        }


        System.out.println(set);
    }
}
