import java.util.List;

public class FP02Strucutred {

    public static void main(String[] args) {
        List<Integer> integers  = List.of(1,23,45,67,2,3,4,5,6,78);

        int sum = addListStructured(integers);
        System.out.println(sum);
    }


    private static int addListStructured(List<Integer> integers) {

        int sum = 0;
        for(int num : integers){
            sum = sum + num;
        }

        return sum;

    }

}
