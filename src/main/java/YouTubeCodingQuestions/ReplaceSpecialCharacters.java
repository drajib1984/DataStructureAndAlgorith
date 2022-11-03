package YouTubeCodingQuestions;

public class ReplaceSpecialCharacters {
    public static void main(String[] args) {
        System.out.println(replaceJunk("java@#@!#&%$learning*&%##$%2023"));
    }

    public static String replaceJunk(String str){
        str=str.replaceAll("[^a-z A-Z 0-9]+","");
        return str;
    }
}
