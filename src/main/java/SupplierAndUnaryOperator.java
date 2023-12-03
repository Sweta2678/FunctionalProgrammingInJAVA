import java.util.Random;
import java.util.function.*;

public class SupplierAndUnaryOperator {

    public static void main(String[] args) {
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };

        System.out.println(randomIntegerSupplier.get());

        UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
        System.out.println(unaryOperator.apply(10));

        BiPredicate<Integer,String> biPredicate = (num,str) -> {
            return num<10 && str.length()>5;
        };
        System.out.println(biPredicate.test(12345,"sweta2"));

        BiFunction<Integer,String,String> biFunction = (num,str) -> {
            return num + " " +str;
        };
        System.out.println(biFunction.apply(10,"swetasss"));

        BiConsumer<String,String> biConsumer = (s1,s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };

        biConsumer.accept("sweta","khatsuriya");

    }




}
