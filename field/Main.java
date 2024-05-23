/* selection sort */
/* insertion sort */
/* shell sort */

import In.In;
import StdOut.StdOut;

public class Main {
    /* sort */
    public static void selectionSort(Comparable[] a) {
        /* in place selection sort */
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // Comparable min = a[i];
            int indexMin = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[indexMin])) {
                    // min = a[j];
                    indexMin = j;
                }
            }
            exch(a, i, indexMin);

        }
    }

    public static void insertionSortMir(Comparable[] a) {
        /* in place insertionSort */
        int N = a.length;

        for (int i = 1; i < N; i++) {

            // insertion process
            for (int j = i - 1; j >= 0; j--) {
                if (less(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    public static void insertionSort(Comparable[] a) {
        /* in place insertionSort */
        int N = a.length;

        for (int i = 1; i < N; i++) {
            // insertion process
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
            }
        }
    }

    /* SHELL SORT */
    public static void shellSort(Comparable[] a) {

        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {

            //loop from h to N by steps of 1
            for (int i = h; i < N; i++) {
                // insertion process
                //insertion by step of h elements
                for (int j = i; j >= h; j-=h) {
                    if (less(a[j], a[j - h])) {
                        exch(a, j, j - h);
                    }
                }
            }

            h = h / 3;
        }

    }

    /* less */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /* exch */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /* isSorted */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    /* show */
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]);
        }
        StdOut.println();
    }

    public static void main(String[] args) {
        Comparable[] arr = In.readStrings();
        /* main call */
        // selectionSort(arr);
        //insertionSortMir(arr);
        //insertionSort(arr);
        shellSort(arr);

        assert (isSorted(arr));
        show(arr);
    }

}