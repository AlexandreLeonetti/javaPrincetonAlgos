/* selection sort */
/* insertion sort */
/* shell sort */

import In.In;
import StdOut.StdOut;

public class Main{
        /* sort */

        /* less */
        public static boolean less(Comparable v, Comparable w){
            return v.compareTo(w) < 0; 
        }

        /* exch */
        public static void exch(Comparable[] a, int i, int j){
            Comparable t = a[i];
            a[i] = a[j];
            a[j]=t;
        }

        /* isSorted */
        public static boolean isSorted(Comparable[] a){
            for(int i=1; i<a.length;i++){
                if(less(a[i],a[i-1])){
                    return false;
                }
            }
            return true;
        }

        /* show */
        public static void show(Comparable[] a){
            for(int i =0; i<a.length; i++){
                StdOut.print(a[i]);
            }
            StdOut.println();
        }

    public static void main(String[] args){
        Comparable[] arr = In.readStrings();
        /* main call */
        //sort()
        assert(isSorted(arr));
        show(arr);
    }

}