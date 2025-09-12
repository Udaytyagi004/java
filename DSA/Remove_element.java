package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Remove_element {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>( Arrays.asList(2,3,5,7,1,2,1,5,1));
        int freq = Collections.frequency(list, 1);
        list.remove(freq);
        System.out.println(list);
    }
}
