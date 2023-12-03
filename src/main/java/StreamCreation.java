import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCreation {
    public static void main(String[] args) {

        System.out.println(IntStream.range(1,10));

        System.out.println(IntStream.range(1,10).sum());

        System.out.println(IntStream.rangeClosed(1,10).sum());

        System.out.println(IntStream.iterate(1,e -> e+2).limit(10).peek(System.out::println).sum());

        System.out.println(IntStream.iterate(0, e-> e+2).limit(10).peek(System.out::println).sum());

        System.out.println(IntStream.iterate(2,e-> e*2).limit(10).peek(System.out::println).sum());

        //to convert primitive to object
        System.out.println(IntStream.iterate(2,e-> e*2).limit(10).boxed().collect(Collectors.toList()));
    }
}
