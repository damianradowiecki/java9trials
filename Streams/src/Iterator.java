import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterator {

    public static void main(String[] args) {
        System.out.println(Stream.iterate(1, i -> i < 12, i -> ++i)
                .map(String::valueOf)
                .collect(Collectors.joining(",")));

        System.out.println();

        for (int i = 1; i < 12 ; i++) {
            System.out.print( i + (i+1 < 12 ? "," : ""));
        }
    }
}
