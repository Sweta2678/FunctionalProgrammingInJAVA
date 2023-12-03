import java.util.List;

public class FP02FunctionalDisinctSort {

    public static void main(String[] args) {
        List<Integer> integers  = List.of(1,23,45,67,2,3,4,5,6,78,1,45,6,8,9,4,5,78);
        disticntListFuntional(integers);
        sortListFuntional(integers);
        sortDistinctListFuntional(integers);
    }

    private static void disticntListFuntional(List<Integer> integers) {
         integers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void sortListFuntional(List<Integer> integers) {
        integers.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void sortDistinctListFuntional(List<Integer> integers) {
        integers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

}
