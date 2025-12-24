import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,45,0,69);

        double avg =  integers.stream().mapToInt(e->e).average().getAsDouble();

        Long cnt = integers.stream().count();

        System.out.println("The Average is "+avg);
    }
}
