import java.util.List;

public class FP01structuredData {

    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,2,3,4,1,2,3,4,10,12,12,13);

       // printAllListElementStructured(List.of(1,2,3,4,1,2,3,4,10,12,12,13));
        printAllListEvenElementStructured(numbers);

    }
    private static void printAllListElementStructured(List<Integer> integers) {
        for(int number :integers){
            System.out.println(number);
        }
    }
    private static void printAllListEvenElementStructured(List<Integer> integers) {
        for(int number :integers){
            if(number%2==0){
                System.out.println(number);
            }
        }
    }
}
