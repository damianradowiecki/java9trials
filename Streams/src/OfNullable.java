import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfNullable {

    public static void main(String[] args) {
        List<Object> result = Stream.ofNullable(null)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
