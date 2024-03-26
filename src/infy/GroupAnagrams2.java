package infy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GroupAnagrams2 {
    public static void groupAnagrams(ArrayList<String> arr){
        Set<Set<String>> set = new HashSet<>();
        Set<String> visited = new HashSet<>();

        for (int i=0; i<arr.size(); i++){
            if (visited.contains(arr.get(i))){
                continue;
            }
            Set<String> tempSet = new HashSet<>();
            for (int j=i+1; j<arr.size(); j++){

                char[] c1 = arr.get(i).toCharArray();
                char[] c2 = arr.get(j).toCharArray();
                Arrays.sort(c1);
                Arrays.sort(c2);
                if (Arrays.equals(c1, c2)){
                    tempSet.add(arr.get(i));
                    tempSet.add(arr.get(j));
                }
            }
            if (!tempSet.isEmpty()){
                set.add(tempSet);
                for (String s : tempSet){
                    visited.add(s);
                }
            }

        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>
                (Arrays.asList("ot", "cat", "dog", "cat", "tom", "god", "ogd"));
        groupAnagrams(arr);
    }
}
