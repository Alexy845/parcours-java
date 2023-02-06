import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        // your code here
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.lastIndexOf(value);
        
        

    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        // your code here
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.indexOf(value);
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        // your code here
        if (list == null || list.size() == 0) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                list.add(i);
            }
        }
        return list;
    }
}