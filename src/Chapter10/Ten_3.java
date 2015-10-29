package Chapter10;

/**
 * Created by Javier G on 10/29/2015.
 */

public class Ten_3 {
//TODO fix it, have main stuff and picture
    public static void main(String[] args) {
        int ex1[] = {15,16,19,20,25,1,3,4,5,7,10,14};
        int ex2[] = {7,10,14,15,16,19,20,25,1,3,4,5};
        int ex3[] = {15,16,19,20,5,6,7,8,9,19,11,12};

        int val1 = findVal(ex1, 5);
        int val2 = findVal(ex1, 19);
        int val3 = findVal(ex2, 5);
        int val4 = findVal(ex2, 15);
        int val5 = findVal(ex2, 1);
        int hmm = findVal(ex3, 5);

        System.out.println("ex1->value of index(5) find is: " + val1);
        System.out.println("ex1->value of index(15) find is: "+val2);
        System.out.println("ex2->value of index(5) find is: "+val3);
        System.out.println("ex2->value of index(15) find is: "+val4);
        System.out.println("ex2->value of index(1) find is: "+val5);
        System.out.println("does it hmm: "+hmm);
    }

    public static int findVal(int[] array, int val){
        return find(0, array.length - 1, val, array);
    }

    private static int find(int start, int end, int val, int[] array) {
        int mid = (start + end)/2;
        if(array[start] == val){
            return start;
        }
        if(array[end] == val){
            return end;
        }
        if(array[mid] == val){
            return mid;
        }
        if(start == end){
            return -1;
        }



        if (array[mid] < array[start]){
            if (val < array[mid]){
                return find(start, mid, val, array);
            }
            if (val > array[mid]){
                if (val < array[end]){
                    return find(mid, end, val, array);
                } else {
                    return find(start, mid, val, array);
                }
            }
        } else {
            if (val > array[mid]){
                return find(mid, end, val, array);
            }
            if (val < array[mid]){
                if (val < array[end]){
                    return find(mid, end, val, array);
                } else {
                    return find(start, mid, val, array);
                }
            }
        }

        return 0;
    }

}
