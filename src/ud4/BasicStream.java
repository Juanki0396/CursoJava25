package ud4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class BasicStream {
    public static void main(String[] args) {
        List<Integer> s = IntStream.range(1, 21)
                 .filter(i -> i%2 == 0)
                 .map(i -> i * i)
                 .collect(ArrayList::new, Collection::add, Collection::addAll);

        // s = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20).stream()
        //         .filter(i -> i%2 == 0)
        //         .map(i -> i * i)
        //         .toList();   

        
        System.out.println(Arrays.toString(s.toArray()));
        System.out.println(s.stream().reduce(0, Integer::sum));
    }
}
