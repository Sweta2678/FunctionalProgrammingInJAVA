import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {
        List<Integer> integers  = List.of(1,23,45,67,2,3,4,5,6,78);

        int sum = addListFuntional(integers);
        System.out.println(sum);
    }

    private static int sum(int a, int b){
        return a+b;
    }
    private static int addListFuntional(List<Integer> integers) {
        return integers.stream()
                //.reduce(0,FP02Functional::sum);
                //.reduce(0,(a,b)->a+b);
                //.reduce(0,Integer::sum);
                .filter(num->!(num%2==0))
                .map(num -> num*num).reduce(0,Integer::sum);
    }

}
