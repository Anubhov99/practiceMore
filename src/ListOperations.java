import java.lang.String;
import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,5,2,66,89,66);

        //To find the min value from an Integer list
        Optional<Integer> min = integers.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);


        //To find the max value
        Optional<Integer> max = integers.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);


        //To count the number of integers in the list
        Long num = integers.stream().count();
        System.out.println(num);

        //get dupe
        Set<Integer> check = new HashSet<>();

        Set<Integer> Dupes = integers.stream().filter(e->!check.add(e)).collect(Collectors.toSet());
        System.out.println("Dupes value is: "+Dupes);


        List<String> list = Arrays.asList("a","xyz");


        List<String> vowels = list.stream().filter(s->s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u") ).collect(Collectors.toList());
        System.out.println(vowels);

        int[] arr = new int[]{3,2,2,3};

        List<Integer> newList = Arrays.stream(arr)
                .boxed().toList();

        Set<Integer> setOfDupes = newList.stream().filter(e->Collections.frequency(newList,e)>1)
                .collect(Collectors.toSet());

        System.out.println("Array Dupes: "+setOfDupes);
    }
}
