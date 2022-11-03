package YouTubeCodingQuestions;

public class PalindromeCheck {
    public static void main(String[] args) {
        PalindromeString("madam");
        PalindromeInteger(525);

    }
    public static void PalindromeString(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);
        }
        if (reverse.equals(str)){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }

    public static void PalindromeInteger(int a){
        int reverse=0;
        int copy =a;
        while (a>0){
            reverse=reverse*10+a%10;
            a=a/10;
        }
        if (reverse==copy){
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
}
