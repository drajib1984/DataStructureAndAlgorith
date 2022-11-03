package YouTubeCodingQuestions;

public class FactorialOfNumber {
    public static void main(String[] args) {
        factorial(0);
    }
    public static void factorial(int a){
        int factorial=1;
        for (int i = 1; i <=a ; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+a+" is "+factorial);
    }
}
