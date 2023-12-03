import java.util.List;

public class FP01FunctionalData {

    public static void main(String[] args) {
       // printAllListElementFunctionalApproach(List.of(2,3,4,1,2,3,4,10,12,12,13));
        //printAllListEvenElementFunctionalApproach(List.of(2,3,4,1,2,3,4,10,12,12,13));
        //printAllListOddElementFunctionalApproach(List.of(2,3,4,1,2,3,4,10,12,12,13));
        printSquareOfListEvenElementFunctionalApproach(List.of(2,3,4,1,2,3,4,10,12,12,13));
        printCubeOfListEvenElementFunctionalApproach(List.of(2,3,4,1,2,3,4,10,12,12,13));

    }

    private static void printCubeOfListEvenElementFunctionalApproach(List<Integer> integers) {
        integers.stream()
                .filter(n -> n%2 != 0)
                .map(n -> n*n)
                .forEach(System.out :: println);
    }

    private static void printAllListOddElementFunctionalApproach(List<Integer> integers) {
        integers.stream()
                .filter(number -> !(number % 2 == 0))
                .forEach(System.out :: println);
    }

    private static void printSquareOfListEvenElementFunctionalApproach(List<Integer> integers) {
        integers.stream()
                .filter(number -> (number % 2 == 0))
                .map(number -> number * number)
                .forEach(System.out :: println);
    }
    //    private static void print(int number){
//        System.out.println(number);
//    }
    private static void printAllListElementFunctionalApproach(List<Integer> integers) {

//        integers.stream().
//                forEach(FP01FunctionalData :: print);

        integers.stream().
                forEach(System.out :: println);
    }

    private static void printAllListEvenElementFunctionalApproach(List<Integer> integers) {

//        integers.stream().
//                forEach(FP01FunctionalData :: print);

//        integers.stream()
//                .filter(FP01FunctionalData::isEven)
//                .forEach(System.out :: println);

        integers.stream()
                .filter(number -> number % 2 == 0) //lambda expression
                .forEach(System.out :: println);
    }

    private static boolean isEven(int number){
        return number%2==0;
    }


}
