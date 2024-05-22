
import java.lang.Comparable;
import StdOut.StdOut;
import In.In;

public class Main {
    /* void sort() */
    public static void sort(Comparable[] a) {
        // insertion sort;
        { // Sort a[] into increasing order.
            int N = a.length;
            for (int i = 1; i < N; i++) { // Insert a[i] among a[i-1], a[i-2], a[i-3]...
                for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                    //StdOut.print(j);
                    exch(a, j, j - 1);

                    //show(a);
                    //StdOut.println();
                }
            }
        }
        // See page 245 for less(), exch(), isSorted(), and main().
    }

    /* boolean less() */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /* void exch() */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /* void show() */
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    /* boolean isSorted() */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    /* void main() */
    public static void main(String[] args) {
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);

    }
}