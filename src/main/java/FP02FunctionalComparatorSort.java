import java.util.Comparator;
import java.util.List;

public class FP02FunctionalComparatorSort {

    public static void main(String[] args) {
        List<Integer> integers  = List.of(1,23,45,67,2,3,4,5,6,78,1,45,6,8,9,4,5,78);
        List<String> courses = List.of("Spring","SpringBoot","Lambda","Functional","Aws","Hello","Kafka");

//        sortComparatorNatural(integers);
//        sortComparatorNaturalCourses(courses);
//        sortComparatorReverseCourses(courses);
        sortComparatorCustom(courses);
    }

    private static void sortComparatorReverseCourses(List<String> courses) {
        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void sortComparatorCustom(List<String> courses) {
        courses.stream()
                .sorted(Comparator.comparing( course ->  course.length()))
                .forEach(System.out::println);
    }

    private static void sortComparatorNaturalCourses(List<String> courses) {
        courses.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    private static void sortComparatorNatural(List<Integer> integers) {
        integers.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }


}
