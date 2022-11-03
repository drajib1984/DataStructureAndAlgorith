package YouTubeCodingQuestions;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseInteger(12345));
    }
    public static int reverseInteger(int input){
        int reverse=0;
        while (input>0) {
            reverse=reverse*10+input%10;
            input=input/10;
        }
        return reverse;
    }
}
