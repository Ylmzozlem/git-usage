package package1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, -1, 5);

        Collections.sort(list);

        Integer array[] = list.toArray(new Integer[5]);

        System.out.println(Arrays.toString(array));
        System.out.println("Student changes");

        System.out.println("I want to see stash situation");
    }
}
