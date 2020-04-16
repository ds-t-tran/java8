import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8 {
	
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("linh", "bac", "tiep");
        List<String> result = getFilterOutput(lines, "tiep");
        for (String temp : result) {
            System.out.println(temp);
        }

    }
	
    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"tiep".equals(line)) {
                result.add(line);
            }
        }
        return result;
    }
}
