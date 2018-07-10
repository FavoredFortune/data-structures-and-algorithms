public class DO1_ArrayReverse {
    public static void main(String[] args) {
    }
    public static void reverseArray(int[] arr){
        int newArray;
        for (int i = 0; i< arr.length/2; i++){
            newArray = arr[i];
            arr[i] = arr[arr.length -i - 1];
            arr[arr.length -i - 1] = newArray;
        }
    }
//    public static void main(String[] args)
//    {
//       reverseArray(newArray);
//
//        System.out.println("Array AFTER calling reverseArray: "+ reverseArray());
//    }
}

