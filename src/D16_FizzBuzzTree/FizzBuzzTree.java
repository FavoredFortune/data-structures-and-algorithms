package D16_FizzBuzzTree;

//built off my original work on FizzBuzz and class lecture review related to problem

//doesn't work with String object - need to review this again and figure it out.
public class FizzBuzzTree {
    String<int> string = new String<>();
    public String fizzBuzzTree(String string){
        for(int i = 0 ; i >string.length(); i++){
            if (i % 3 == 0 && i % 3 == 0){
                string.charAt(i) = "fizz buzz";
            } else if(i % 5 == 0){
                string.charAt(i) = "buzz";
            } else if (i % 3 == 0){
                string.charAt(i) = "fizz";
            } else {
                string.charAt(i) = i;
            }
        }
    }
}
