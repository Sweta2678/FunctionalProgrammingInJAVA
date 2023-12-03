import java.util.List;
import java.util.stream.Collectors;

public class FunctionalListCollect {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 23, 45, 67, 2, 3, 4, 5, 6, 78, 1, 45, 6, 8, 9, 4, 5, 78);
        List<String> courses = List.of("Spring", "SpringBoot", "Lambda", "Functional", "Aws", "Hello", "Kafka");

//        List<Integer> doubledIntegers = doubleList(integers);
//        System.out.println(doubledIntegers);

//        List<Integer> squareIntegerListForEvenElements = squareForEvenElements(integers);
//        System.out.println(squareIntegerListForEvenElements);

        List<String> coursesWithLength =  coursesOfTitleWithLength(courses);
        System.out.println(coursesWithLength);

        List<Integer> coursesLen =  coursesLength(courses);
        System.out.println(coursesLen);

    }

    private static List<String> coursesOfTitleWithLength(List<String> courses) {
        return courses.stream()
                .map(x -> x.length()+"  "+ x)
                .collect(Collectors.toList());
    }
    private static List<Integer> coursesLength(List<String> courses) {
        return courses.stream()
                .map(x -> x.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> squareForEvenElements(List<Integer> integers) {
       return integers.stream()
                .filter(n -> n%2 == 0)
                //.map( n -> n*n)
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> integers) {
        return integers.stream()
                .map( n -> n* n)
                .collect(Collectors.toList());
    }


}
