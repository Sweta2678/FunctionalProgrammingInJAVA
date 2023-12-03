import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int numOfStudents;

    public Course(String name, String category, int reviewScore, int numOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.numOfStudents = numOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", numOfStudents=" + numOfStudents +
                '}';
    }

    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("spring1","cloud",98,20000),
                new Course("spring2","cloud",87,30000),
                new Course("spring3","AWS",99,40000),
                new Course("spring4","azure",88,50000),
                new Course("spring5","AWS",89,60000),
                new Course("spring6","java",90,70000),
                new Course("spring7","php",91,80000),
                new Course("spring8","java",92,90000),
                new Course("spring9","java",93,22000),
                new Course("spring10","AWS",94,23000),
                new Course("spring11","cloud",95,20000),
                new Course("spring12","php",96,24000),
                new Course("spring13","java",97,25000)
        );

        //all match , none match, any match

        /*System.out.println(courses.stream()
                .allMatch(course -> course.reviewScore> 80));*/

        Predicate<Course> reviewScore80Predicate = course -> course.reviewScore > 80;
        Predicate<Course> reviewScore90Predicate = course -> course.reviewScore > 90;
        Predicate<Course> reviewScore70Predicate = course -> course.reviewScore < 70;


        System.out.println(courses.stream()
                .allMatch(reviewScore80Predicate));

        System.out.println(courses.stream()
                .noneMatch(reviewScore70Predicate));

        System.out.println(courses.stream()
                .anyMatch(reviewScore70Predicate));

        Predicate<Course> courseStudentPredicate = course -> course.numOfStudents > 30000;
        Predicate<Course> courseStudentPredicate2 = course -> course.numOfStudents > 20000;
        Predicate<Course> courseStudentPredicate3 = course -> course.numOfStudents > 10000;


        System.out.println(courses.stream()
                .allMatch(courseStudentPredicate));

        System.out.println(courses.stream()
                .noneMatch(courseStudentPredicate2));

        System.out.println(courses.stream()
                .anyMatch(courseStudentPredicate3));


        //sort

        Comparator comparByNumOfStudentsIncreasing = Comparator.comparing(Course::getNumOfStudents);

        Comparator comparByNumOfStudentsDecreasing = Comparator.comparing(Course::getNumOfStudents).reversed();

        Comparator comparByNumOfStudentsAndNUmOfReviews = Comparator.comparing(Course::getNumOfStudents).thenComparing(Course::getReviewScore).reversed();

        courses.stream()
                .sorted(comparByNumOfStudentsIncreasing)
                        .forEach(System.out::println);
                //.collect(Collectors.toList()));

        System.out.println("--------------------------------------------------------------------------------------------");

        courses.stream()
                .sorted(comparByNumOfStudentsDecreasing)
                .forEach(System.out::println);
                //.collect(Collectors.toList()));

        courses.stream()
                .sorted(comparByNumOfStudentsAndNUmOfReviews)
                .forEach(System.out::println);

        System.out.println(courses.stream()
                .sorted(comparByNumOfStudentsAndNUmOfReviews)
                .limit(5)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparByNumOfStudentsAndNUmOfReviews)
                .skip(3)
                .limit(2)
                .collect(Collectors.toList()));

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(courses);

        System.out.println(courses.stream()
                .takeWhile(course -> course.reviewScore>=95)
                .collect(Collectors.toList()));

        System.out.println("----------*********************************8----------------------------------------------------------------------------------");

        courses.stream()
                .dropWhile(course -> course.reviewScore>=98)
                .forEach(System.out::println);

        System.out.println("********************* ************");

        System.out.println(courses.stream()
                .max(comparByNumOfStudentsAndNUmOfReviews));


        System.out.println(courses.stream()
                .min(comparByNumOfStudentsAndNUmOfReviews));

        System.out.println(courses.stream()
                        .filter(course -> course.reviewScore<=50)
                .min(comparByNumOfStudentsAndNUmOfReviews));


        System.out.println(courses.stream()
                //.filter(reviewScore70Predicate)
                .min(comparByNumOfStudentsAndNUmOfReviews)
                .orElse(new Course("Kubernetes","java",70,10000)));

        System.out.println(courses.stream()
                .filter(reviewScore70Predicate)
                .min(comparByNumOfStudentsAndNUmOfReviews)
                .orElse(new Course("Kubernetes","java",70,10000)));

        System.out.println(courses.stream()
                .filter(reviewScore70Predicate)
                .findFirst());

        System.out.println(courses.stream()
                .filter(reviewScore80Predicate)
                .findFirst());

        System.out.println(courses.stream()
                .filter(reviewScore80Predicate)
                .findAny());

        //sum of students
        System.out.println(
                courses.stream()
                        .filter(reviewScore80Predicate)
                        .mapToInt(Course::getNumOfStudents)
                        .sum()
        );

        //average student
        System.out.println(
                courses.stream()
                        .filter(reviewScore80Predicate)
                        .mapToInt(Course::getNumOfStudents)
                        .average()
        );

        //count
        System.out.println(
                courses.stream()
                        .filter(reviewScore90Predicate)
                        .mapToInt(Course::getNumOfStudents)
                        .count()
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScore90Predicate)
                        .mapToInt(Course::getNumOfStudents)
                        .max()
        );

        System.out.println(
                courses.stream()
                        .filter(reviewScore90Predicate)
                        .mapToInt(Course::getNumOfStudents)
                        .min()
        );

        System.out.println(
        courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory)));

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName,Collectors.toList()))));

        int cutOffReviewScore = 90;

        Predicate<Course> reviewScore90Predicate2 = createPredicateForCutoffPredicate(95);
        Predicate<Course> reviewScore80Predicate2 = createPredicateForCutoffPredicate(80);

    }
    private static Predicate<Course> createPredicateForCutoffPredicate(int cutOffReviewScore) {
        return course -> course.reviewScore > cutOffReviewScore;
    }


}

