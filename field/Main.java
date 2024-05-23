/* selection sort */
/* insertion sort */
/* shell sort */

import In.In;
import StdOut.StdOut;

public class Main{
        /* sort */
        public static void selectionSort(Comparable[] a){
            /* in place selection sort */
            int N = a.length;
            for( int i = 0; i<N; i++){
                //Comparable min = a[i];
                int indexMin = i;
                for (int j =i+1;j<N; j++){
                    if(less(a[j],a[indexMin])){
                        //min = a[j];
                        indexMin = j;
                    }
                }
                exch(a, i, indexMin);

            }
        }

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
        selectionSort(arr);
        assert(isSorted(arr));
        show(arr);
    }

}