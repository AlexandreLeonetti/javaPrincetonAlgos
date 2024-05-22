//package shellSort;

import In.In;
import StdOut.StdOut;

public class Main {
    /* void sort() */
    private static Comparable[] aux;

    public static void sort(Comparable[] a, int lo, int mid, int hi)// merge
    { // Merge a[lo..mid] with a[mid+1..hi].
        aux = new Comparable[a.length]; // Allocate space just once.
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
            aux[k] = a[k];
        for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
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
