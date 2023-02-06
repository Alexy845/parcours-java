import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        for (Integer i : list) {
            if (i.equals(value)) {
                return true;
            }
        }
        return false;
    }
}