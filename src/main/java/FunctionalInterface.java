import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,3,4,5,6,7,78,34,12,7);


        Predicate<Integer> integerPredicate = x -> x % 2 == 0;

        Predicate<Integer> EvenPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };


        Function<Integer, Integer> integerIntegerFunction = x -> x * x;
        Function<Integer, Integer> integerFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };


        Consumer<Integer> println = System.out::println;

        Consumer<Integer> print = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        };


        numbers.stream()
                .filter(integerPredicate)
                .map(integerIntegerFunction)
                .forEach(println);

        System.out.println("-------------------------------");

        numbers.stream()
                .filter(EvenPredicate)
                .map(integerFunction)
                .forEach(print);

        BinaryOperator<Integer> sum1 = Integer::sum;

        BinaryOperator<Integer> sum2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x+y;
            }
        };

        int sumTotal = numbers.stream()
                .reduce(0, sum1);

        System.out.println("Total "+sumTotal);

        int sumFinal = numbers.stream()
                .reduce(0, sum2);
        System.out.println("Final Total "+sumFinal);

    }
}
