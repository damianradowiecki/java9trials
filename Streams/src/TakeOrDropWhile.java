import java.util.stream.Stream;

public class TakeOrDropWhile {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,4,3,2,1)
                .dropWhile(e -> e < 5)
                .forEach(System.out::print);
        System.out.println();
        Stream.of(1,2,3,4,5,4,3,2,1)
                .takeWhile(e -> e < 5)
                .forEach(System.out::print);
    }
}
