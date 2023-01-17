import java.util.ArrayList;

public class BuildString {
    public String buildString(ArrayList<Integer> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : arrayList) {
            stringBuilder.append(i).append(' ');
        }
        return stringBuilder.toString();
    }
}
