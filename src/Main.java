import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str1 = "Anubhov";
        String str2 = "Anubhov";

        System.out.println(str1);
        System.out.println(str2);

        List<Integer> lst = Arrays.asList(1,2,3,4,5);

        List<Integer> list2 = lst.stream().filter(e->e>=4).collect(Collectors.toList());

        System.out.println("Above 4 : "+list2);
        Long count = lst.stream().count();

        Double avg = lst.stream().mapToInt(e->e).average().getAsDouble();

        Integer max = lst.stream().max(Integer::compareTo).get();

        Optional<Integer> sum = lst.stream().reduce(Integer::sum);

        System.out.println("\nCount :"+count+"\nAverage :"+avg+"\nMax :"+max+"\nSum :"+sum);

    }
}