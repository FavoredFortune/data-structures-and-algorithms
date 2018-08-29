package D36_MergeSort;

public class MergeSort {

    public static int[] mergeSort(int[] array){
        if( array.length == 0){
            return array;
        }
        int size = array.length;

        if (size<2){
            return array;
        }
        int[] leftH = leftHalvesies(array);
        int[] rightH = rightHalvesies(array);

        leftH = mergeSort(leftH);
        rightH = mergeSort(rightH);

        int[] result = zip(leftH, rightH);

        return result;
    }

    public static int[] leftHalvesies(int[] leftArray){
        int size = leftArray.length;

        if (size<2){
            return leftArray;
        }

        int middle = (int)Math.floor(size/2);
        int[] left = new int[middle];

        for(int i =0; i<middle; i++){
            left[i] = leftArray[i];
        }
        return left;
    }

    public static int[] rightHalvesies(int[] inputArray){
        int size = inputArray.length;
        if (size<2){
            return inputArray;
        }
        int middle  = (int)Math.floor(size/2);
        int[] right;

        if(middle % 2 == 0) {
            right = new int[middle + 1];
        } else if (middle == 1 && inputArray.length % 2 == 0 ) {
            right = new int[middle];
        } else{
            right = new int[middle + 1];
        }

        int j = 0;
        for(int i = middle; i< inputArray.length; i++){
            right[j] = inputArray[i];
            j++;
        }
        return right;
    }

    public static int[] zip(int[] left, int[] right){
        int newSize = left.length + right.length;
        int[] result = new int[newSize];
        int leftCounter = 0;
        int rightCounter = 0;

        while (leftCounter< left.length && rightCounter< right.length) {
            if (left[leftCounter] <= right[rightCounter]) {
                result[leftCounter + rightCounter] = left[leftCounter];
                leftCounter++;
            } else {
                result[leftCounter + rightCounter] = right[rightCounter];
                rightCounter++;
            }
        }
        while(rightCounter < right.length){
            result[leftCounter+rightCounter] = right[rightCounter];
            rightCounter++;
        }

        while(leftCounter < left.length){
            result[leftCounter+rightCounter] = left[leftCounter];
            leftCounter++;
        }
        return result;
    }
}