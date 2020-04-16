import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {
	
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("linh", "bac", "tieptest");

        List<String> result = lines.stream()                
                .filter(line -> !"tieptest".equals(line))     
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);

    }
}
