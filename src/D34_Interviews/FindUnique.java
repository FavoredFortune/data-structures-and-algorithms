//package D34_Interviews;
//
//import java.util.HashSet;
//import java.util.Set;
//
////just scratching out Amy's solution for my own reference. I thought it worked and it doesn't.
//
//public class FindUnique {
//
//    public static boolean isUnique(String string){
//
//        boolean isUnique = true;
//        Set<Character> uniqueChars = new HashSet<>();
//        uniqueChars = string.split("");
//
//        for (String chars: uniqueChars) {
//            if(uniqueChars.contains (" ")) {
//                continue;
//            }
//            if (uniqueChars.contains(chars)) {
//                isUnique = false;
//                return isUnique;
//            }
//        }
//
//        return isUnique;
//    }
//}
//
////Class solution
//public class FindUnique {
//
//    public static boolean isUnique(String string){
//
//        boolean isUnique = true;
//
//        String[] uniqueChars = string.split("");
//
//        Set<Character> seen = new HashSet<>();
//
//        for (int i = 0; i< string.length()-1; i ++) {
//            for (int j = 0; j < string.length() - 1; j++)
//                if (i != j) {
//                    char character = string.charAt(i);
//                    char character2 = string.charAt(j);
//                    if (character == character2) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return isUnique;
//    }
//}
//
