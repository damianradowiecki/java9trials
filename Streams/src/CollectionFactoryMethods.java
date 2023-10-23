import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethods {

    public static void main(String[] args) {
        System.out.println(List.of(1, 2, 3, 4, 5));
        System.out.println(Set.of("a", "b", "c", "d"));
        System.out.println(Map.of("a", 1, "b", 2, "c", 3));
    }
}
