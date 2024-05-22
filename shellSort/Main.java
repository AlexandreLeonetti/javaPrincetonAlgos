//package shellSort;

import In.In;
import StdOut.StdOut;

public class Main {
    /* void sort() */

    public static void sort(Comparable[] a) { // Sort a[] into increasing order.
        int N = a.length;
        int h = 1;
        while (h < N / 3){
            h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
            //StdOut.print("while loop 1");
            //StdOut.println();
        }
            //StdOut.println("h final value is "+h);
        while (h >= 1) { // h-sort the array.
            //StdOut.print("while loop 2");
            //StdOut.println("h value is "+h);

            for (int i = h; i < N; i++) { // Insert a[i] among a[i-h], a[i-2*h], a[i-3*h]... .
                StdOut.println(i+" "+a[i]+" "+a[i-h]+" "+less(a[i], a[i-h]));
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h){
                    show(a);
                    exch(a, j, j - h);
                }
            }

            h = h / 3;
        }
    }

    /* boolean less() */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /* void isSorted */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i - 1], a[i])) {
                return false;
            }
        }
        return true;
    }

    /* void show() */
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    /* void main() */
    public static void main(String[] args) {
        Comparable[] a = In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
