import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class behaviorParametarization {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 23, 45, 67, 2, 3, 4, 5, 6, 78, 1, 45, 6, 8, 9, 4, 5, 78);
        List<String> courses = List.of("Spring", "SpringBoot", "Lambda", "Functional", "Aws", "Hello", "Kafka");

        Predicate<Integer> evenPredicate = x -> x % 2 == 0;

       // filterAndPrint(integers, evenPredicate);

        Predicate<Integer> oddPredicate = x -> x % 2 != 0;

       // filterAndPrint(integers, oddPredicate);

        Predicate<Integer> dividebythreePredicate = x -> x % 3 == 0;

      //  filterAndPrint(integers, dividebythreePredicate);

//        integers.stream()
//                .filter(evenPredicate)
//                .forEach(System.out::println);


        Function<Integer, Integer> integerSquareFunction = x -> x * x;

        List<Integer> sqaureNum = getCollect(integers, integerSquareFunction);
        System.out.println(sqaureNum);
    }

    private static List<Integer> getCollect(List<Integer> integers, Function<Integer, Integer> integerSquareFunction) {
        return integers.stream()
                .map(integerSquareFunction)
                .collect(Collectors.toList());
    }

//    private static void filterAndPrint(List<Integer> integers, Predicate<Integer> predicate) {
//        integers.stream()
//                .filter(predicate)
//                .forEach(System.out::println);
//    }
}
