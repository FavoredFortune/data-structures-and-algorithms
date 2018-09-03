
public class MergeSort {

    public static double[] mergeSort(double[] array){
        if( array.length == 0){
            return array;
        }
        int size = array.length;

        if (size<2){
            return array;
        }
        double[] leftH = leftHalvesies(array);
        double[] rightH = rightHalvesies(array);

        leftH = mergeSort(leftH);
        rightH = mergeSort(rightH);

        double[] result = zip(leftH, rightH);

        return result;
    }

    public static double[] leftHalvesies(double[] leftArray){
        int size = leftArray.length;

        if (size<2){
            return leftArray;
        }

        int middle = (int)Math.floor(size/2);
        double[] left = new double[middle];

        for(int i =0; i<middle; i++){
            left[i] = leftArray[i];
        }
        return left;
    }

    public static double[] rightHalvesies(double[] inputArray){
        int size = inputArray.length;
        if (size<2){
            return inputArray;
        }
        int middle  = (int)Math.floor(size/2);
        double[] right;

        if(size % 2 == 0) {
            right = new double[middle];
        } else{
            right = new double[middle + 1];
        }

        int j = 0;
        for(int i = middle; i< inputArray.length; i++){
            right[j] = inputArray[i];
            j++;
        }
        return right;
    }

    public static double[] zip(double[] left, double[] right){
        int newSize = left.length + right.length;
        double[] result = new double[newSize];
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