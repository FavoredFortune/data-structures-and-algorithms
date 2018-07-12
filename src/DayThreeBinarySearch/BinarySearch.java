package DayThreeBinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
         int[] sortedArray = {4,8,15,16,23,42};
         int key =15;
         searchArray(sortedArray, key);
    }
    public static int searchArray(int[] sortedArray, int key){
        int m = sortedArray.length/2;
        for (int i =0; i<m; i++){
            if( sortedArray[i] == key){
                return i;
            } else if ( sortedArray[i] < key){
                int k = i/2 +1;
                for(int j = 0; j<k; j++) {
                    if (sortedArray[j] == key) {
                        return j;
                    } else {
                        return -1;
                    }
                    if (sortedArray[i] > key) {
                        int r = i * 2;
                        for (int q = 0; q < r; q++) {
                            if (sortedArray[q] == key) {
                                return q;
                            } else {
                                return -1;
                            }
                        }
                    }
                }
            } searchHelperRight(m);
        }
    }
    public static int searchHelperRight(int r, int[] sortedArray, int key) {
        int e = (sortedArray.length - 1) - r;
        for (int i = r; i > e; i++) {
            if (sortedArray[i] == key) {
                return i;
            } else if (sortedArray[i] > key) {
                int r = i * 2;
                for (int q = 0; q < r; q++) {
                    if (sortedArray[q] == key) {
                        return q;
                    } else {
                        return -1;
                    }
                }
            }

        } return 0;
    }
}