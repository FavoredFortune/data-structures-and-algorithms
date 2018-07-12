package DayThreeBinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {4, 8, 15, 16, 23, 42};
        int key = 15;
        searchArray(sortedArray, key);
    }

    public static int searchArray(int[] sortedArray, int key) {
        int m = sortedArray.length / 2;
        for (int i = 0; i < m; i++) {
            if (sortedArray[i] == key) {
                return i;
            } else if (sortedArray[i] < key) {
                int k = i / 2 + 1;
                for (int j = 0; j < k; j++) {
                    if (sortedArray[j] != key) {
                        return -1;
                    } else if (sortedArray[j] > key) {
                        return -1;
                    } else if(sortedArray[j] != key) {
                        return j;
                    }
                }
            }                   searchHelperRight(m, sortedArray, key);
        }     return 0;
    }


    public static int searchHelperRight(int rr, int[] sortedArray, int key) {
        int e = (sortedArray.length - 1) - rr;
        for (int i = rr; i > e; i++) {
            if (sortedArray[i] == key) {
                return i;
            } else if (sortedArray[i] > key) {
                rr = i * 2;
                for (int q = 0; q < rr; q++) {
                    if (sortedArray[q] == key) {
                        return q;
                    } else {
                        return -1;
                    }
                }
            }

        }
        return 0;
    }
}

