import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,3,5,7,9);
        List<String> immutable = new ArrayList<>();

        Optional<Integer> sum = list.stream().reduce(Integer::sum);
        sum.ifPresent(System.out::println);




        Optional<Integer> sum1 = list.stream().reduce((a,b)->a+b);
        System.out.println("The sum is"+sum1.get());



        List<Integer> list1 = Arrays.asList(2,22,243,789,85,255);
        List<Integer> list2 = list.stream().map(e->String.valueOf(e))
                .filter(i->i.startsWith("2"))
                .map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list);
    }
}
