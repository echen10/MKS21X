import java.util.*;
public class Driver {
    public static void main(String[] args) {
        int[] a = {3,9,5,2};
        System.out.println(Arrays.toString(a));
        Sorts.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
