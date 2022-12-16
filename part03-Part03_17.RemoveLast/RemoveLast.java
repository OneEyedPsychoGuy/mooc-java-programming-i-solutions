import java.util.ArrayList;

public class RemoveLast {
    public static void removeLast(ArrayList<String> list) {
        if(list.size() == 0) {
            return;
        }
        list.remove(list.size() - 1);
    }
}