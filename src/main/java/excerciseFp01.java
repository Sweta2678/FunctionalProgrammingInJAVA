import java.util.List;

public class excerciseFp01 {

    public static void main(String[] args) {
        //printAllCourses(List.of("Spring","SpringBoot","Lambda","Functional"));
        //printAllCoursesWithSpringWord(List.of("Spring","SpringBoot","Lambda","Functional"));
        printAllCoursesWithLength4(List.of("Spring","SpringBoot","Lambda","Functional","aws","hello","kafka"));

    }

    private static void printAllCoursesWithLength4(List<String> courses) {
        courses.stream()
                .map(word -> (word.length() >= 4) ? word.substring(0,4) : word)
                .forEach(System.out :: println);
    }
    private static void printAllCoursesWithSpringWord(List<String> courses) {
        courses.stream()
                .filter( word -> word.contains("Spring"))
                .forEach(System.out :: println);
    }

    private static void printAllCourses(List<String> courses) {

        courses.stream()
                .forEach(System.out :: println);

    }
}
