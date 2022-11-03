package YouTubeCodingQuestions;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        String[] names = {"Java", "Python", "Ruby", "C", "C++", "Python", "Java"};
        int count=0;
        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if (names[i].equals(names[j])){
                    System.out.println("Duplicates are: "+names[i]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


