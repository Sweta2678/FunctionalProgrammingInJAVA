import java.util.List;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "SpringBoot", "Lambda", "Functional", "Aws", "Hello", "Kafka");

        courses.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        courses.stream()
                .map(String :: toUpperCase) //method reference although it is not static method
                .forEach(System.out::println);

        Supplier<String> supplier = () -> new String();

        Supplier<String> supplier2 = String::new; //constructor reference



    }
}
