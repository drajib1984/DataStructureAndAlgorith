package YouTubeCodingQuestions;

public class CheckStringContainsOnlyNumbers {
    public static void main(String[] args) {
        String str = "222";

        if(str.matches("[0-9]+")){
            System.out.println("It contains only digit");
            }
        else {
                System.out.println("It contains digit & other characters");
            }

    }
}
