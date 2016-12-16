import java.util.*;
public class Driver {
    public static void main(String[] args) {
        int[] a = {3,2,1,6,7,4,3,1};
        System.out.println(Arrays.toString(a));
        Sorts.bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
